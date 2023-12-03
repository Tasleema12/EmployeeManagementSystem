package dao;

import java.util.List;



import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import dto.Employee;

import dto.Employee;
public class EmployeeDao {
EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("dev");
EntityManager entityManager=entityManagerFactory.createEntityManager();
EntityTransaction entityTransaction=entityManager.getTransaction();

public void insert(Employee e) {
	entityTransaction.begin();
	entityManager.persist(e);
	entityTransaction.commit();
}

public List<Employee> fetchall(){
	Query q=entityManager.createQuery("select data from Employee data");
	List<Employee> emps=q.getResultList();
	return emps;
//	for(Employee v:emps) {
//		entityTransaction.begin();
//		entityManager.persist(v);
//		entityTransaction.commit();
//		}
//	return emps;
	
//	if(emps.isEmpty()) {
//		return "no data found";
//	}else {
//	
//	}
	
}

public String deleteall(){
	Query q=entityManager.createQuery("select data from Employee data");
	List<Employee> emps=q.getResultList();
	if(emps.isEmpty()) {
		return "no data found";
	}else {
		for(Employee uv:emps) {
			entityTransaction.begin();
			entityManager.remove(uv);
			entityTransaction.commit();
		}
	return "Data deleted";
	}
  
}

public Employee fetchbyid(int id) {
	Employee e=entityManager.find(Employee.class,id);
//	if(e!=null) {
//		return e;
//	}else {
//		return "No data found";
//	}
	return e;
}

public void deleteid(int id) {
	Employee e=entityManager.find(Employee.class,id);
	//if(e!=null) {
		entityTransaction.begin();
		entityManager.remove(e);
		entityTransaction.commit();
	//}else {
	//	return "No data found";
	//}
}
		
public void update(Employee e) {
	entityTransaction.begin();
	entityManager.merge(e);
	entityTransaction.commit();

}
}
