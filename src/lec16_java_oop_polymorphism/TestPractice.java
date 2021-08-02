package lec16_java_oop_polymorphism;

import java.util.Scanner;

public class TestPractice {

	public static void main(String[] args) {		
		Scanner scanner = new Scanner(System.in); // System Class, in is a property of InputStream
		System.out.println("Please enter age here: ");
		int age1 = scanner.nextInt(); 
		int age2 = scanner.nextInt(); 
		if (age1 < age2) { //here (val1 < val2) is condition
			System.out.println(age1 + " is shorter than " + age2);
		} else if(age1 > age2){
			System.out.println(age1 + " is bigger than " + age2);
			
		}
		scanner.close();

	}

}
