package com.lti.misc.exceptionhandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandler {
public static void main(String[] args) {
	int i=0;
	try(FileInputStream fr=new FileInputStream("C:\\pic.png");
			FileOutputStream fw=new FileOutputStream("c:\\pic1.png"))
	{
	while((i=fr.read())!=-1)
		{
			//System.out.print((char)i);
		fw.write(i);
		}
		System.out.println("done...");
		} catch (FileNotFoundException e) {
				System.out.println("file not found");
				e.printStackTrace();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
	}
}
