package com.huda.lambdaexpression;

public class LambdaAsMethodArgumentTwo {
	
	public static void main(String[] args) {
		printMethod(s -> s.length());
	}

	public static void printMethod(MyType lambda) {
		System.out.println(lambda.perform("Hello"));
	}

}



interface MyType{
	int perform(String s);
}