package com.xylem.rajesh;

import java.util.ArrayList;
import java.util.List;

public class ListofEmp {
	public static void main(String[] args) {
		Person p=null;
		Employee e=null,e1=null;

		p=new Person();
		e=new Employee();
		e1=new Employee();
		
		p.setHobbies(null);
		p.setId(102);
		p.setName("Rajesh");
		p.setPhoneNo(123456789l);
		p.setSkills(null);
		
		e.setEid(101);
		e.setHeadPhone("sony");
		e.setLaptopModel("dell");
		e.setOffice("Xylem.inc");
		e.setRole("Devloper");
		
		e1.setEid(102);
		e1.setHeadPhone("Sumsang");
		e1.setLaptopModel("Lenovo");
		e1.setOffice("Xylem.inc");
		e1.setRole("Tester");
		
		List<Employee> emp=null;
		emp=new ArrayList<Employee>();
		emp.add(0,e);
	
		emp.add(1,e1);
		for(Employee em:emp) {
		System.out.println(em);
		}
		
	}
}
