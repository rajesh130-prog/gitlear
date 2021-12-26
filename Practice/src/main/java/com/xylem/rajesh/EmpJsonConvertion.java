package com.xylem.rajesh;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;

public class EmpJsonConvertion {
	
	Person p;
	int eid;
	String role;
	String office;
	String laptopModel;
	String headPhone;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p=null;
		EmpJsonConvertion empjscon=null;
		Employee emp=null;
		Skill skl=null;
		Hobbies hbl=null;
		emp=new Employee();
		List<Skill> sk=null;
		List<Hobbies> hb=null;
		
		skl=new Skill(new String[] {"JAVA","Python"});
		
		hbl=new Hobbies(new String[] {"Reading","Sleeping"});
		
		sk=new ArrayList<Skill>();
		sk.add(skl);
		hb=new ArrayList<Hobbies>();
		hb.add(hbl);
		p=new Person();
		p.setHobbies(hb);
		p.setId(234);
		p.setName("Rajesh");
		p.setPhoneNo(1234567890l);
		p.setSkills(sk);
		
		emp.setEid(1234);
		emp.setHeadPhone("Sony");
		emp.setLaptopModel("Dell");
		emp.setOffice("Xylem.Inc");
		//emp.setP(p);
		emp.setRole("Java Developer");
		
		System.out.println("Converstion JAVA to JSON");
		System.out.println(new Gson().toJson(emp));
	}

}
