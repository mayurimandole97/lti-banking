package com.lti.practise;

import java.util.Comparator;

public class EmpNameComparator implements Comparator<Emp> 
{
public int compare(Emp e1,Emp e2)
	{
		return(e1.getName().compareTo(e2.getName()));
	}
	

	
	
	
	
	
	
	
}
