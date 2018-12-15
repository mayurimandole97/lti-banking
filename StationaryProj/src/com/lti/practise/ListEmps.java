package com.lti.practise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
@SuppressWarnings("deprecation")
public class ListEmps {
public static void main(String[] args) {
	
	Emp e1=new Emp(231,"john",33343);
	Emp e2=new Emp(232,"alex",33342);
	Emp e3=new Emp(233,"steve",33344);
	Emp e4=new Emp(234,"monica",33353);
	Emp e5=new Emp(235,"ron",33362);
	Emp e6=new Emp(236,"dev",33374);
	
	List<Emp> emplist=new ArrayList<>();
	emplist.add(e1);
	emplist.add(e2);
	emplist.add(e3);

	List<Emp> temp_emplist=new ArrayList<>();
	temp_emplist.add(e4);
	temp_emplist.add(e5);
	temp_emplist.add(e6);
	List<Emp>allEmployees=new LinkedList<>();
	allEmployees.addAll(emplist);
	allEmployees.addAll(temp_emplist);
	
	Iterator  iterator=allEmployees.iterator();
	while(iterator.hasNext())
	{
			Emp empp=(Emp)iterator.next();
					System.out.println(empp);
	}
	allEmployees.remove(2);
	System.out.println("After removing all emp:");
	for (Emp e:allEmployees)
	{
		System.out.println(e);
	}
	
	
	System.out.println(emplist);
	System.out.println(temp_emplist);
	
	List <Integer> list2 = new LinkedList<>();
	Integer [] arr2 = {56,34,56,67,56,90,67};
	list2=Arrays.asList(arr2);
	
	for (int i:list2)
	{
		System.out.println(i);
	}

Set<Integer> set1=new HashSet<>();
		set1.addAll(list2);
		System.out.println(set1);
	
	TreeSet  <Integer>set11 = new TreeSet<>();
	set11.add(34);
	Integer [] arr = {56,34,56,67,56,90,67,342};
	List <Integer>list1 = Arrays.asList(arr);
	set11.addAll(list1);
	System.out.println(set11);
	
	System.out.println("after sorting by comparable");
	Collections.sort(allEmployees);
	for (Emp e:allEmployees)
		System.out.println(e);
	
	System.out.println("after sorting on name by comparable");
	Collections.sort(allEmployees,new EmpNameComparator());
	for (Emp e:allEmployees)
		System.out.println(e);
	
	System.out.println("after sorting on id by comparable");
	Collections.sort(allEmployees,new EmpIdComparator());
	for (Emp e:allEmployees)
		System.out.println(e);

Map<String,Emp> empMap= new HashMap<>();
empMap.put("Admin", e1);
empMap.put("IT", e2);
empMap.put("IT", e3);
System.out.println("Complete set");
System.out.println(empMap.entrySet());
System.out.println("Only the values");
System.out.println(empMap.values());
System.out.println("Only the keys");
System.out.println(empMap.keySet());

System.out.println(e1.getId());

}
}





