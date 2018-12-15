package com.lti.practise;

import java.util.Arrays;
import java.util.StringTokenizer;

public class StringDemo {
public static void main(String[] args) {
		StringBuilder sb1=new StringBuilder();
		sb1.append("this is a new string");
		sb1.replace(0,10,"hello");
		System.out.println(sb1);
		System.out.println(sb1.length() + "length");
		System.out.println(sb1.capacity() + "capacity");
		sb1.ensureCapacity(100);
		
		System.out.println(sb1.capacity());
		System.out.println(sb1.charAt(10));
		
		sb1.reverse();
		System.out.println(sb1);
		
	System.out.println(sb1.substring(5,10 ));
		String names="ahan, reena, mayuri, mithila";
		//String [] newnames=names.split(",");
		//System.out.println(Arrays.toString(newnames));
		StringTokenizer tokens=new StringTokenizer(names, ",");
		while(tokens.hasMoreElements())
		{
			String element =(String)tokens.nextElement();
			System.out.println(element);
		}
		
		
		
	
	
	
	
	
	
	
	}
}
