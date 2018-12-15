package com.lti.misc;

import java.util.Scanner;

public class TestCalculator {
public static void main(String[] args)
{
	int input1,input2,output1,output2,output3,output4;
Calculator c1=new Calculator(input1,input2);
	Scanner scanner =new Scanner(System.in);
	
	/*input1=c1.getNum1();
input2=c1.getNum2();*/
	System.out.println("enter num1");
	input1=scanner.nextInt();
	System.out.println("enter num2");
	input2=scanner.nextInt();
	
	/*Calculator c2=new Calculator(9,10);
	input1=c2.getNum1();
	input2=c2.getNum2();*/
/*Calculator c1=new Calculator(input1,input2);*/
output1 = c1.add(input1,input2);
System.out.println("addn is"+output1);

/*output2 = c2.sub(input1, input2);
System.out.println("subn is"+output2);

output3 = c2.mul(input1, input2);
System.out.println("muln is"+output3);

output4 = c2.div(input1, input2);
System.out.println("divn is"+output4);*/
}
}
