package com.huda.lambdaexpression;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

/*
 * Predicate<T>	: T → boolean 
 * - A Predicate takes one input and return a boolean value as output
 * - Functional Method: test()
 * 
 * Function<T, R> :	T → R
 * - A Function takes one input and produces a result 
 * - Functional Method: apply()
 * 
 * Consumer<T> : T	→  
 * - A Consumer takes one input with no return value
 * - Functional Method: accept()
 * 
 * Supplier<T> :  → T
 * - A Supplier represents a supplier of results
 * - Functional Method: get()
 * 
 */
public class BuiltInFunctionalInterfaces {

	public static void main(String[] args) {

		Predicate<String> stringLen = s -> s.length() < 10;
		System.out.println(stringLen.test("Apples") + " - The word Apples has less than 10 letters.");

		Consumer<String> consumerStr = s -> System.out.println(s.toLowerCase());
		consumerStr.accept("ABSNKSNSfdsf");

		Function<Integer, String> converter = num -> Integer.toString(num);
		System.out.println("The length of the String(26) is: " + converter.apply(26).length());

		Supplier<String> supplier = () -> "Java is fun";
		System.out.println(supplier.get());

		Supplier<Double> doubleSupplier = () -> Math.random();
		System.out.println(doubleSupplier.get());

		// Working with two inputs
		BiPredicate<Boolean, Boolean> biPredicate = (a, b) -> Boolean.logicalAnd(a, b);
		System.out.println(biPredicate.test(true, false));
		
		BiPredicate<Integer, Integer> biPredicate2 = (t, u) -> t > u;
		if(biPredicate2.test(10, 5))
			 System.out.println("10 is bigger than 5");

		BiConsumer<String, String> biConsumer = (a, b) -> System.out.println(a + b);
		biConsumer.accept("Hello", " World");

		BiFunction<Integer, Integer, Integer> biFunction = (a, b) -> a * b;
		System.out.println("BiFunction:" + biFunction.apply(10, 10));
		
		// extends Function<T,T>
		BinaryOperator<Integer> add = (a, b) -> a + b;
		System.out.println("add 10 + 25: " + add.apply(10, 25));

		// extends BiFunction<T,T,T>
		UnaryOperator<String> str = msg -> msg.toUpperCase();
		System.out.println(str.apply("This is my message in uppercase."));

		IntFunction<String> intToString = num -> Integer.toString(num);
		System.out.println("The length of the string is: " + intToString.apply(123).length());

		IntFunction<String> intToString2 = Integer::toString;
		System.out.println("The length of the string is: " + intToString2.apply(4567).length());

	}

}
