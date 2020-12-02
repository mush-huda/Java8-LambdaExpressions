package com.huda.lambdaexpression;

/*
 * We use lambda expressions to create anonymous methods. Sometimes, however, a 
 * lambda expression does nothing but call an existing method. In those cases,
 * it's often clearer to refer to the existing method by name. 
 * 
 * There are 4 types of method references:
 * 
 * 		(1) Reference to a static method.
 * 			- ContainingClass::staticMethodName  
 * 
 * 		(2) Reference to an instance method of a particular object 
 * 			- containingObject::instanceMethodName
 *  
 *  	(3) Reference to an instance method of an arbitrary object of a particular type
 *  		- ContaingType::methodName
 *  
 * 		(4) Reference to a constructor
 * 			- ClassName::new
 * 
 */

@FunctionalInterface
interface MyFunctionalInterface {
	abstract void say(); 
}


public class MethodReferences {

	public static void main(String[] args) {
		
		MyFunctionalInterface sayable1 = MethodReferences::saySomething;
		sayable1.say();
		
		MethodReferences myObj = new MethodReferences();
		MyFunctionalInterface sayable2 = myObj::saySomethingGood;
		sayable2.say();
		
		MyFunctionalInterface sayable3 = new MethodReferences()::saySomethingGood;
		sayable3.say();
		
		
	}
	
	public static void saySomething() {
		System.out.println("This is a reference to a static method");
	}
	
	public void saySomethingGood() {
		System.out.println("This is a reference to an instance method");
	}
}
