package com.lti.misc;

import java.util.Arrays;

public class Arr {
public static void main(String[] args)
{
	char var1='a';
	char [] varr=new char[10];
	int [] numss=new int[10];
	for(int i=0;i<10;i++) {
		varr[i]='a';
		numss[i]=(int)varr[i];
		i++;
		
	}
	System.out.println(Arrays.toString(varr));
	System.out.println(Arrays.toString(numss));
	
	
	double [] num= {23.45,56.6,85.69,54.20};
	
	Arrays.sort(num);
	System.out.println(Arrays.toString(num));
}
}
