package com.xylem.rajesh;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeClient {
	
	public static void main(String[] args) {
		String lpm=null,hedphn=null,office=null,role=null;
		int eid=0;
		OfficeStaf os=null;
		Employee e=null;
		Person p=null;
		Skill sk=null;
		Scanner sc=null;
		sc=new Scanner(System.in);
		System.out.print("Enter Employee Id ");
		eid=sc.nextInt();
		System.out.println("Enter HeadPhone ");
		hedphn=sc.next();
		System.out.print("Enter Laptop ");
		lpm=sc.next();
		System.out.print("Enter Role ");
		role=sc.next();
		System.out.println("Enter Office ");
		office=sc.next();
		sk=new Skill(new String[] {"JAVA","Python"});
		Hobbies hb=null;
		hb=new Hobbies(new String[] {"Reading","Sleeping"});
		
		List<Skill> skills=null;
		skills=new ArrayList<Skill>();
		skills.add(sk);
		
		List<Hobbies> hobbie=null;
		hobbie=new ArrayList<Hobbies>();
		hobbie.add(hb);
		
		p=new Person();
		p.setId(50420);
		p.setName("Rajesh");
		p.setPhoneNo(9078634173l);
		p.setHobbies(hobbie);
		p.setSkills(skills);
		
		e=new Employee();
		e.setEid(eid);
		e.setHeadPhone(hedphn);
		e.setLaptopModel(lpm);
		e.setOffice(office);
		e.setRole(role);
		e.setP(p);
		
		System.out.println(e);
		
		
		
		
	}
}
