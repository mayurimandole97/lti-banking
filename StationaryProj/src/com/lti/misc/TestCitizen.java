package com.lti.misc;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;

public class TestCitizen {
public static void main(String[] args) {
	Address address1=new Address("	THE ADDRESS","MGM Rd","MUMBAI","400001");
	Address address2=new Address("	mirabhy","link Rd","thane","400512");
	Address address3=new Address("	malad","MGM Rd","MUMBAI","400022");
	LocalDate date1=LocalDate.of(2002, 10, 10);
	
Citizen citizen1=new Citizen ("1111_3222_1212","Amit",address1,date1);
System.out.println(citizen1);
date1=date1.plusMonths(5);
Citizen citizen2=new Citizen ("1341_3222_1212","Sumit",address2,date1);
System.out.println(citizen2);
date1=date1.minusYears(2);
Citizen citizen3=new Citizen ("0000_3222_1212","Anita",address3,date1);
System.out.println(citizen3);

Citizen [] citizens = {citizen1,citizen2,citizen3};

try(FileOutputStream fos=new FileOutputStream("c:\\citizendata.txt");
		
		ObjectOutputStream oos=new ObjectOutputStream(fos))
{
	oos.writeObject(citizen1);
	oos.writeObject(citizen2);
	oos.writeObject(citizen3);
} 
catch (FileNotFoundException ae) {
	ae.printStackTrace();
} catch (IOException e) {
	e.printStackTrace();
}
System.out.println("done writing");
}
}

