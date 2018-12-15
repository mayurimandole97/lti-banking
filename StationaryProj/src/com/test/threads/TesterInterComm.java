package com.test.threads;

import java.util.Scanner;

public class TesterInterComm {
public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	System.out.println("enter msg1");
	Data msg=new Data(scn.next());
	System.out.println("enter msg2");
	Data msg2=new Data(scn.next());
	Sender sender1=new Sender(msg2);
	Sender sender2=new Sender(msg);
	new Thread(sender2,"sender2").start();
	Receiver receiver=new Receiver(msg);
	
	receiver.start();
	sender2.start();
new Thread(receiver,"receiver").start();
System.out.println("all threads are started");
}
}
