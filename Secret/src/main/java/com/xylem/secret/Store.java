package com.xylem.secret;

import java.util.HashMap;
import java.util.Map;

public class Store {
	
	private HashMap<String,String> maps;
	
	public HashMap<String, String> getMaps() {
		return maps;
	}

	public void setMaps(HashMap<String, String> maps) {
		this.maps = maps;
	}
	
	public  HashMap Insert(String key,String value) {
		String keys=key;
		String values=value;
		Store st=null;
		st=new Store();
		maps=new HashMap<String,String>();
		maps.put(keys, values);
		
		
		if(key!=null) {
			System.out.println("Secret is Saved");
		}
		else
			System.out.println("Please Enter a Secret");
		return maps;
	}
	
}