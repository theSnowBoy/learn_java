package javaTest;

import java.lang.reflect.Method;

public class BasicType {

	public static void main(String args[]){
		int a= 10;
		int b = 10;
		method(a,b);
		System.out.println("a="+a);
		System.out.println("b="+b);
	}
	public static void method(int a,int b){
		System.out.println("a="+ 100);
		System.out.println("b="+ 200);
		System.exit(0);
	}
}
