package com.lti.practise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class AnimalTest {
	public static void main(String[] args) {
	AnimalFactory factory = new AnimalFactory();
 Animal animal=null;
	try(InputStreamReader is=new InputStreamReader(System.in);
	BufferedReader br=new BufferedReader(is))
{
	System.out.println("enter the type of herbivores/carnivores");
	String type = br.readLine();
	animal= factory.createAnimal(type);
	System.out.println("created the type");
	animal.eat();
} catch (IOException e) {
	}






}
}
