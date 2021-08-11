package lec20_java_switch_method;

// switch method generally used when constant type data is used

public class A2_example_of_switch_in_level_of_java_by_scanner_class {

	public static void main(String[] args) {
		String MyLevelOfJava = "Intermediate";
		int level = 0;

		switch (MyLevelOfJava) {
		case "Beginner":
			level = 1;
			break;

		case "Intermediate":
			level = 2;
			break;

		case "Expert":
			level = 3;
			break;

		case "Excellent":
			level = 4;
			break;

		default:
			level = 0;
			break;
		}

		switch (MyLevelOfJava) {
		case "Beginner":

			break;

		default:
			break;
		}

		System.out.println("My Level of Java is: " + level);
	}

}
