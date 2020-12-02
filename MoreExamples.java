package com.huda.lambdaexpression;

public class MoreExamples {
	public static void main(String[] args) {
		
		NumericTest isEven = n -> (n % 2) == 0;
		System.out.println(isEven.computeTest(5));
		
		NumericTest isNegative = n -> n < 0;
		System.out.println(isNegative.computeTest(5));
		
		
		GreetingInt morning = (name) -> "Good Morning " + name;
		GreetingInt evening = (name) -> "Good Evening " + name;
		System.out.println(morning.greet("Luis"));
		System.out.println(evening.greet("Angelica"));
		
	}
}

@FunctionalInterface
interface GreetingInt {
	abstract String greet(String name);
}

@FunctionalInterface
interface NumericTest {
	boolean computeTest(int n);
}

