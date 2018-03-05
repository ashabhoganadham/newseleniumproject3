package com.corejava;
//we are inheriting properties from sample1 to sample2

//here we r doing within the same package,like this we can acquire properties from class which is in different pacakage also
public class Sample2 extends Sample1 {

	int j=20;
	
	public void m2()
	{
		System.out.println("hi i am m2 method from sample2");
	}


public static void main(String args[])
{
   Sample2 s2=new Sample2();
   System.out.println(s2.i);
   System.out.println(s2.j);
   s2.m1();
   s2.m2();
}
}
