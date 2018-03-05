package com.practise.session;

public class Democlass implements DemoInterface {
	int a=10;
	public void m1()
	{
		System.out.println(" hi iam from m1 method");
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		System.out.println("hi i am m2 method from Demointerface");
	}

	@Override
	public void m3() {
		// TODO Auto-generated method stub
		System.out.println("hi i am m3 method from DemoInterface");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("hi i am from main method");
		Democlass d=new Democlass();
		System.out.println(d.a);
		d.m1();
		d.m2();
		d.m3();
		
		

	}

	
}
