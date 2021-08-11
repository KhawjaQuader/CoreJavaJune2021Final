package lec21_java_string_manipulation;

// https://docs.oracle.com/javase/7/docs/api/java/lang/String.html

public class StringManipulation01 {

	public static void main(String[] args) {

		String s = "Lorem ipsum dolor sit amet consectetur adipisicing elit. Voluptas tempora debitis maiores nemo modi! Alias pariatur nulla rem ipsum, molestiae modi atque dignissimos eius impedit, dolorem iusto voluptatem qui ea?";

		// To know the length (including space): length()
		System.out.println("\n");
		System.out.println("The length of the String is: " + s.length());

		// Converts all of the characters in this String to lower case
		System.out.println("\n");
		System.out.println(s.toLowerCase());

		// Converts all of the characters in this String to upper case
		System.out.println("\n");
		System.out.println(s.toUpperCase());

		// To know the character at a specific position:
		// charAt() -- Returns the char value at the specified index.
		System.out.println("\nThe character at a specific position(0): " + s.charAt(0));
		System.out.println("\nThe character at a specific position(10): " + s.charAt(10));
		System.out.println("\nThe character at a specific position(126): " + s.charAt(126));

		// To know the position of the character in which index
		// indexOf() -- Returns the index within this string of the first occurrence of the specified character.
		System.out.println("\nThe character 'L' is, at the position of: " + s.indexOf('L')); //String indexing starts from 0
		System.out.println("\nThe character 'V' is, at the position of: " + s.indexOf('V')); 
		System.out.println("\nThe character 'v' is, at the position of: " + s.indexOf('v')); //case sensitive
		System.out.println("\nThe character 'm' is, at the position of: " + s.indexOf('m')); //if present more than one, the first own is recognized
		System.out.println("\nThe character 'x' is, at the position of: " + s.indexOf('x')); //if any character is absent, it shows -1.
		
		// Returns the index within this string of the first occurrence of the specified substring.
		System.out.println("\nThe index of 'dolor' word is: " +s.indexOf("dolor") );
		System.out.println("\nThe index of 'Dolor' word is: " +s.indexOf("Dolor")); //case sensitive
		System.out.println("\nThe index of 'debitis' word is: " +s.indexOf("debitis")); 
		System.out.println("\nThe index of 'pariatur' word is: " +s.indexOf("pariatur")); 
		
		// To know the position of the repetitive character in which index: s.indexOf('a', s.indexOf('a')+1)) 
		System.out.println("\nThe first 'r' character is - at the position of: " +s.indexOf('r')); //2, 16, 37
		System.out.println("\nThe second 'r' character is - at the position of: " +s.indexOf('r', s.indexOf('r') + 1)); // this is not used much
		System.out.println("\nThe third 'r' character is - at the position of: " +s.indexOf('r', s.indexOf('r', s.indexOf('r')+2) + 1)); // this is not used much
		
		// The substring begins with the character at the specified index and extends to
		// the end of this string.
		System.out.println(s.substring(10));

		// this substring is important
		// The substring begins at the specified beginIndex and extends to the character
		// at index (endIndex - 1)
		// start index 0, end index (25-1), similar like initialization block and
		// conditional block
		System.out.println("\n");
		System.out.println(s.substring(0, 25));
		System.out.println("\n");
		System.out.println(s.substring(5, 65));
	}

}
