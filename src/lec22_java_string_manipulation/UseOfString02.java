package lec22_java_string_manipulation;

import java.util.Arrays;

// https://docs.oracle.com/javase/7/docs/api/java/lang/String.html

public class UseOfString02 {

	public static void main(String[] args) {

		String s1 = "My name is John. ";
		String s2 = "My name is John. ";
		String s3 = "my name is john. ";
		String s4 = "MY NAME IS JOHN. ";
		
		// To compare Strings and return a boolean value
		// Returns 'true' if the given object represents a String equivalent to this string, false otherwise
		System.out.println(s1.equals(s2)); 
		System.out.println(s1.equals(s3)); 
		
		
		System.out.println(s3.equals(s4)); // how that can be solved
		System.out.println(s3.toUpperCase().equals(s4)); 
		System.out.println(s4.toLowerCase().equals(s3)); 

		// Two strings are considered equal ignoring case if they are of the same length 
		// and corresponding characters in the two strings are equal ignoring case.
		System.out.println(s3.equals(s4)); // how that can be solved
		System.out.println(s3.equalsIgnoreCase(s4));
		
		// The java string trim() method eliminates leading and trailing spaces. 
		// To avoid white space: trim() -- (remove any leading and trailing whitespace) 
		String s5 = "          HelloWorld.  ";
		System.out.println("\nAfter trimming: " + s5.trim());
		
		// can't remove white space from center
		String s6 = "    Hello    World!    ";
		System.out.println("\nAfter trimming: " + s6.trim());
		
		// The java string replace() method returns a string replacing all the old char or CharSequence to new char or CharSequence.
		// To replace we use replace() method
		// Returns a string resulting from replacing all occurrences of oldChar in this string with newChar.
		String s7 = "Good morning";
		System.out.println("After replacing: " + s7.replace('m', 'M') );
		
		String s8 = "      GooD morning      ";
		System.out.println("After replacing: " + s8.replace('D', 'd') );
		
		String s9 = "      Good moRning      ";
		System.out.println("After triming and replacing: " + s9.trim().replace('R', 'r') );
		System.out.println("If the above methods are used, now the value of String is: " + s9);
		
		System.out.println("After triming and replacing: " + s5.trim().replace('.', '!') );
		
		String s10 = "Hello! Let's learn together";
		System.out.println("After replacing a word: " + s10.replace("Hello!", "Welcome to Java.") );
		
		String date = "08/11/2021"; // very much used
		System.out.println("After replacing: " + date.replace('/', '-') );
		
		// The java string replaceAll() method returns a string replacing all the sequence of characters matching regex and replacement string.
		System.out.println("After replacing the complete word: " + s5.replaceAll(s5, "Hey Hey captian!"));
		
		// regular way of concatenation
		System.out.println(s1+s10);
		
		// Concatenation
		// The Java String class concat() method combines specified string at the end of this string. It returns a combined string.
		String s11 = "My name is ";
		String s12 = "Tofael";
		System.out.println("\n" + s11.concat(s12));
		
		// You don't need to study below code (learn later)
		// use of split()
		// The java string split() method splits this string against a given regular expression and returns a char array.
		String line = "I am a java developer";
		String[] words = line.split(" "); // converted to a List
		System.out.println("\nString split with delimiter: " +Arrays.toString(words)); // outcome is a List
		
		String[] Words2 = line.split(" ", 3); // see the outcome and understand it	
		System.out.println("String split into two: " + Arrays.toString(Words2));

		// You don't need to study below code (learn later)
		//regex = regular expression
		// split string delimited with special characters
		String wordsWithNumbers = "I|am|a|java|developer";
		String[] numbers = wordsWithNumbers.split("\\|");
		System.out.println("String split with special character: " + Arrays.toString(numbers));
		
		// split() to get the string into pieces->changes into String type List[]
		System.out.println("\n^^^^^^^^^^^^^ changing s1 into String[] ^^^^^^^^^^^^^^^^ ");
		String[] ar = s1.split(" ");
		System.out.println(Arrays.toString(ar));
		for (int i = 0; i < ar.length; i++) { // here length is a property, not method
			System.out.println(ar[i]);
		}
		
		System.out.println("\n-------------------------------------------");
		String s13 = "Hello_Selenium_java_Jenkins";
        String array[]=s13.split("_");
        System.out.println(Arrays.toString(array));
        for(int i =0; i<array.length;i++){
            System.out.println(array[i]);
        }
		
		
		

		
		
		
		
		
		
		
	}

}
