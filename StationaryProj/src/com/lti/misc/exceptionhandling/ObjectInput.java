package com.lti.misc.exceptionhandling;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

import com.lti.misc.Citizen;

public class ObjectInput {
public static void main(String[] args) {
	List <Citizen> citizenlist = new ArrayList<>();
	
	try(FileInputStream fis=new FileInputStream("c:\\citizendata.txt");
			ObjectInputStream ois=new ObjectInputStream(fis))
	{
	while(true){
		Citizen citizen=(Citizen)ois.readObject();
		
		citizenlist.add(citizen);}
	} catch (EOFException eof) {
		
	System.out.println("eof");
	} catch (FileNotFoundException e) {
		
	System.out.println("file not found");
	} catch (IOException e) {
	
		System.out.println("some error in raed/write");
	} catch (ClassNotFoundException e) {
		
	System.out.println("class not found");
	}
	System.out.println(citizenlist);
}
}
