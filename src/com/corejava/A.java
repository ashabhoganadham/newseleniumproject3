package com.corejava;

public class A {
	
	int i=10;//global variable
	public void m1()
	{
		int i=20;//it is local variable inside this method means local is the preferred than global, so it takes i value as 20
		System.out.println(i);
		
	}
	
           public void m2()
           {
        	   int i=30;//local variable to this method m2
        	   System.out.println(i);
        	   
           }
	
           public static void main(String[] args) {
		// TODO Auto-generated method stub
                       
        	   A a=new A();
        	   System.out.println(a.i);//printing global variable ie 10
        	   a.m1();//calling the method m1 and printing the body
        	   a.m2();//calling method m2 and printing the body
        	   
	}

}
