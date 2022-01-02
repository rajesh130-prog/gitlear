package com.xylem.secret;

import java.util.Scanner;

public class RetrieveSecret {
	Store st=new Store();
	

	public String retrive() {
		
		Scanner sc=null;
		sc=new Scanner(System.in);
		System.out.println("Enter key for Retrieve your values ");
		String key=sc.next();
		return st.getMaps().get(key);
    }
	
	}
		

