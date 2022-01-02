package com.nt.test;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;

import org.junit.Test;

import com.xylem.secret.Store;

public class StoreTest {
	@Test
	public void checkData() {
		
		Store is=new Store();
		HashMap actual=is.Insert("rk","Raja");
		HashMap expect=new HashMap() {
           @Override
        public Object put(Object key, Object value) {
        	// TODO Auto-generated method stub
        	return super.put(key,value);
        }
        };
        expect.put("rk","Raja");
        
        assertEquals(expect, actual);
		
		
		
		
	}
}
