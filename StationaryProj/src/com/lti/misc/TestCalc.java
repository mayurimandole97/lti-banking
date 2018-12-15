package com.lti.misc;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
@RunWith(value=Parameterized.class)
public class TestCalc {
	private long expected;
	private int value1;
	private int value2;
	String usname;
	String pass;
	Scanner scn=new Scanner(System.in);

Calculator c = new Calculator();
@Test
public void m7()
{ assertEquals(expected, new Calculator().add(value1, value2));
}

@BeforeClass
public static void m1()
{
	
	
	System.out.println("testing begins");
}
@Before
public void m3()
{
	System.out.println("before testing ..unit lvl");
}
@After
public void m4()
{
	System.out.println("after testing ..unit lvl");
}
@AfterClass
public static void m2()
{
	System.out.println("testing wnds");
}

	@Test
	public void testAdd() {
		System.out.println("testing");
		assertEquals(12,c.add(6, 6));
	
	}

	@Test
	public void testSub() {
		System.out.println("testing");
		assertEquals(4,c.sub(10, 6));
	}

	@Test
	public void testMul() {
		System.out.println("testing");
		assertEquals(36,c.mul(6, 6));
	}

	@Test
	public void testDiv() {
		System.out.println("testing");
		assertEquals(2,c.div(12, 6));
	}
	@Test(expected=NullPointerException.class)
	public void testuser() {
				System.out.println("enter username ");
		usname= scn.next();
		System.out.println("enter password ");
		pass= scn.next();
			assertEquals("admin",usname);
		 assertEquals("1234",pass);
				System.out.println("welcome admin 1234");
		
	if(usname.equals(" "))
					throw new NullPointerException();
		
	}
	@Parameters
	public static Collection data()
	{return
			Arrays.asList(new Object[][] {{ 1, 0 , 1}, { 10, 5 ,5},{23,18,5},{34,17,1}});
	}
	public TestCalc(long expected,int value1,int value2)
	{
		this.expected=expected;
	this.value1=value1;
	this.value2=value2;
	}


}
