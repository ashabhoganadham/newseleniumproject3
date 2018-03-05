package com.corejava;

public class Variables{
	
	static int i;
	static String cname="sv";
	
	int a=10;//instance variable
	
	static  Variables x;//reference variable means class object
	
	public void m1()//instance method
	{

	System.out.println(a);//we can call directly an instance variable or with classname in instance method or block
	}

	
	public  static void m2()//static method
	{
      x=new Variables();
	System.out.println(x.a);//we need to declare class object to call instance variable in static method or block
	}

	public static void main(String[] args) {
	x=new Variables();
	System.out.println(x.a);
	x.m1();
	x.m2();

	}

}
