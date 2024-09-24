package com.EagerOrLazy;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
@Entity
public class Student {
	@Id
	private int sid;
	private String sname;
	@ManyToMany(mappedBy = "stud",fetch = FetchType.EAGER)
	private List<Laptop> lap;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public List<Laptop> getLaptop() {
		return lap;
	}
	public void setLaptop(List<Laptop> lap) {
		this.lap = lap;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + "]";
	}
	
	
	

}
