package com.xylem.secret;

import java.util.Scanner;

public class InsertSecret {
	
	public static void main(String[] args) {
		String key=null,
		keyval=null;
		String value=null;
		RetrieveSecret rst=null;
		rst=new RetrieveSecret();
		Store st=null;
		st=new Store();
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a Key ");
		key=sc.next().toLowerCase();
		System.out.print("Enter a Value ");
		value=sc.next();
		if (value.length() > 20) {
			   value = "";
			   System.out.println("String should not be more than 20");
			  value=sc.next();
			}
		
		st.Insert(key, value);
		
		//System.out.println(st.maps.keySet());
		//System.out.println("Retrieve Key");
		//keyval=sc.next();
		System.out.println(rst.retrive()); 
		//System.out.print(st.getMaps());
		
		
	}
}
