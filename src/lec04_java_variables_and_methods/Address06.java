package lec04_java_variables_and_methods;

/*
 * 1) " " -- is called empty String
 * 
 * */
public class Address06 { // Opening of Class body
	static String MyName = "Mohammad Sharkar";
	static int houseNumber = 625;
	static char houseDirection = 'W';
	static int streetNumber = 57;
	static String CityName = "New York";
	static String State = "NY";
	static int zipCode = 10019;
	static boolean inUSA = true;

	public static void main(String[] args) { // below we are calling multiple variables. but the outcome doesn't mean
												// anything
		System.out.println(MyName + "\n" + houseNumber + houseDirection + " " + streetNumber + "th St\n" + CityName
				+ ", " + State + " " + zipCode + "\n");
		System.out.println("Is the adress inside USA?" + inUSA);

	}

} // Closing of Class body
