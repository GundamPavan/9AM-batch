package com.automationframework.javasection;

public class MethodDemoClass3 {
	public void addition(int a, int b) {
		int c = a + b;
		System.out.println("addition of values::" + c);
	}

	public static void subtraction(int a, int b) {
		int d = a - b;
		System.out.println("subtraction of values::" + d);
	}

	public static void main(String[] args) {
		MethodDemoClass3 demo = new MethodDemoClass3();
		demo.addition(100, 200);
		subtraction(300, 400);

	}

}
