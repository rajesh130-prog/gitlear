package com.xylem.rajesh;

import java.util.Arrays;

public class Skill {
	
	String[] skill;
	
	public Skill() {
		System.out.println("0-param");
	}
	public Skill(String[] skill) {
		this.skill = skill;
	}


	@Override
	public String toString() {
		return "Skill [" + Arrays.toString(skill) + "]";
	}
	
		
}
