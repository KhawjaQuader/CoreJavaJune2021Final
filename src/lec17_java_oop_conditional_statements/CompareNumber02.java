package lec17_java_oop_conditional_statements;

//First condition is if
// we don't use 2 if condition, rather we use if in one condition and else in another condition, but one if condition is ok.
// Generally the true statement comes at the end
// when we write else, no condition is necessary

public class CompareNumber02 {

	public static void main(String[] args) {
		int val1 = 113;
		int val2 = 45;

		if (val1 < val2) {
			System.out.println(val1 + " is shorter than " + val2);
		}else {
			System.out.println(val1 + " is greater than " + val2);
		}
	

	}

}
