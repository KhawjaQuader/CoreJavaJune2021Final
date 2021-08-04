package lec16_java_oop_polymorphism;

import java.util.Scanner;

public class TestPractice {

	public static void main(String[] args) {		
		Scanner scanner = new Scanner(System.in); // System Class, in is a property of InputStream
		System.out.println("Please enter age here: ");
		int val1 = scanner.nextInt(); 
		int val2 = scanner.nextInt(); 
		if (val1 % 2 == 0 && val1 < val2) {
			System.out.println(val1 + " is an even number and shorter than " + val2);
		} else if (val1 % 2 == 0 && val1 > val2) {
			System.out.println(val1 + " is an even number and greater than " + val2);
		} else if (val1 % 2 == 1 && val1 < val2) {
			System.out.println(val1 + " is an odd number and shorter than " + val2);
		} else if (val1 % 2 == 1 && val1 > val2) {
			System.out.println(val1 + " is an odd number and greater than " + val2);
		} else if (val1 % 2 == 0 && val1 != val2) {
			System.out.println(val1 + " is an even number and not equal to " + val2);
		} else if (val1 % 2 == 0 && val1 == val2) {
			System.out.println(val1 + " is an even number and equal to " + val2);
		} else if (val1 % 2 == 1 && val1 != val2) {
			System.out.println(val1 + " is an odd number and not equal to " + val2);
		} else if (val1 % 2 == 1 && val1 >= val2) {
			System.out.println(val1 + " is an odd number and (greater than or)  equal to " + val2);
		} else {
			System.out.println("This is not a vlid case");
		}
		scanner.close();

	}

}
