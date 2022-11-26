package com.automationframework.javasection;

public class MethodDemoClass2 {
	public void addition() {
		int a = 100;
		int b = 200;
		int c = a + b;
		System.out.println("addition of values" + c);
	}

	public static void main(String[] args) {
		MethodDemoClass2 demo = new MethodDemoClass2();
		demo.addition();

	}

}
