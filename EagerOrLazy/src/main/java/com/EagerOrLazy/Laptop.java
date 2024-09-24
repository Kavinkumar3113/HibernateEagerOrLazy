package com.EagerOrLazy;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
@Entity
public class Laptop {
	@Id
 private int lid;
 private String lname;
 @ManyToMany
 private List<Student> stud;
public int getLid() {
	return lid;
}
public void setLid(int lid) {
	this.lid = lid;
}
public String getLname() {
	return lname;
}
public void setLname(String lname) {
	this.lname = lname;
}
public List<Student> getStudent() {
	return stud;
}
public void setStudent(List<Student> stud) {
	this.stud = stud;
}
@Override
public String toString() {
	return "Laptop [lid=" + lid + ", lname=" + lname + "]";
}

 
}
