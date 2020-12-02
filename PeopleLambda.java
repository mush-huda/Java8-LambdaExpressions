package com.huda.lambdaexpression;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
 * Lambdas can be used to replace Anonymous Inner Classes, although they are not the same!
 */

public class PeopleLambda {

	public static void main(String[] args) {

		List<People> people = Arrays.asList(
				new People("John", "Doe", 22), 
				new People("Merry", "Jane", 22),
				new People("Lewis", "Carrol", 26), 
				new People("Alex", "Hans", 28)
		  );

		
		System.out.println("\nWithout using Lambdas - Sorting people by last name: \n");
		Collections.sort(people, new Comparator<People>() {
			@Override
			public int compare(People p1, People p2) {
				return p1.getLastName().compareTo(p2.getLastName());
			}
		});
		
		printAll(people);
	
		
		// Advantage: No need to for anonymous class implementation
		System.out.println("\nUsing Lambdas - Sorting people by last name: \n");
		Collections.sort(people, (p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));

		printAll(people);
		
	}

	
	// utility method
	private static void printAll(List<People> people) {
		for (People p : people) {
			System.out.println(p);
		}
	}

}


