package com.huda.lambdaexpression;

public class LambdaAsMethodArgument {
	
	public static void main(String[] args) {
		
		MyString myString = (s) -> {
			String result = " ";
			for(int i = s.length()-1; i >= 0; i--) 
				result = result + s.charAt(i);
			
			return result;
		};
		
		System.out.println(reverseString(myString, "Hello"));
		
		
	}
	
	
	public static String reverseString(MyString myString, String anyString){
		 return myString.myStringFunction(anyString);
	}
}


@FunctionalInterface
interface MyString {
	abstract String myStringFunction(String str);
}