package dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	@Id
private int id;
private String name;
private String email;
private String pwd;
private String date;
private String gender;
private String checkk;
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPwd() {
	return pwd;
}
public void setPwd(String pwd) {
	this.pwd = pwd;
}
public String getDate() {
	return date;
}
public void setDate(String date) {
	this.date = date;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getCheck() {
	return checkk;
}
public void setCheck(String check) {
	this.checkk = check;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", email=" + email + ", pwd=" + pwd + ", date=" + date
			+ ", gender=" + gender + ", checkk=" + checkk + "]";
}

}
