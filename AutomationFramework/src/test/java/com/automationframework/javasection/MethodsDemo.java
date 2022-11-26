package com.automationframework.javasection;

public class MethodsDemo {
	int a = 10;

	static int b = 30;

	public void addition() {
		System.out.println("addition is executed");
	}

	public static void subtraction() {
		System.out.println("subtraction is executed");
	}

	public static void main(String[] args) {
		subtraction();
		MethodsDemo method = new MethodsDemo();
		method.addition();
		System.out.println(method.a);
		System.out.println(+b);
	}

}
