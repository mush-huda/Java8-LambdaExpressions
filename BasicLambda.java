package com.huda.lambdaexpression;


/*
 * Lambda Expressions are basically on the fly implementation of an abstract method of an interface.
 * 
 * (1)The on the fly implementation accomplishes the Type Inference from the method signature of the abstract method.
 * 
 * (2)We can assign a lambda expression to a variable. The type of the variable will be the interface type.   
 * 
 * (3)To execute the lambda expression assigned to a variable, we call the abstract method of the interface with the dot operator.
 * 
 */

/*
 * From Java8, an interface can have concrete methods inside it as well. Therefore, it is necessary
 * for an interface to have only one abstract method inside it to be a Functional Interface. 
 */

public class BasicLambda {

	public static void main(String[] args) {
		MyAdd addFunction = (a, b) -> a + b;
		System.out.println(addFunction.addTwoNumbers(4, 6));
	}
	
}



@FunctionalInterface
interface MyAdd{
	int addTwoNumbers(int x, int y);
}
