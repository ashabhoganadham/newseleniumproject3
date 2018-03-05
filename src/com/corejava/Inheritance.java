package com.corejava;

public class Inheritance extends Datatypes {

	int x=10;
	
	public void m1()
	{
		System.out.println(x);
	}
	
	public void m2()
	{
		System.out.println(x);
	}
	
	public static void main(String[] args) {

		Inheritance i=new Inheritance();
		i.m1();
		i.m2();
		i.m3();//we r inheriting method and calling from datatypes class
	}

}
