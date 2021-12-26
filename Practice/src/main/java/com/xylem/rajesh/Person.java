package com.xylem.rajesh;

import java.util.ArrayList;
import java.util.List;

public class Person {
	int id;
	String name;
	List<Skill> skills;
	List<Hobbies>hobbies;
	long phoneNo;
	
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
	public List<Skill> getSkills() {
		return skills;
	}
	public void setSkills(List<Skill> skills) {
		
		this.skills = skills;
	}
	public List<Hobbies> getHobbies() {
		return hobbies;
	}
	public void setHobbies(List<Hobbies> hobbies) {
		this.hobbies = hobbies;
	}
	public long getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}
/*	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", skills=" + skills + ", hobbies=" + hobbies + ", phoneNo="
				+ phoneNo + "]";
	}*/
	
	}

