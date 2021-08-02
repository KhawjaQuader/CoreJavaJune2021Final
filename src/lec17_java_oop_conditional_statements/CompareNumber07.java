package lec17_java_oop_conditional_statements;

//First condition is if
// we don't use 2 if condition, rather we use if in one condition and else in another condition, but one if condition is ok.
// Generally the true statement comes at the end
//when we write else, no condition is necessary
// if we wanna write a second condition , we have to use else if
// == equality operator
// != not equal to


public class CompareNumber07 {

	public static void main(String[] args) {
		int val1 = 45;
		int val2 = 45;

		if (val1 < val2) {
			System.out.println(val1 + " is shorter than " + val2);
		} else if (val1 > val2) {
			System.out.println(val1 + " is greater than " + val2);
		} else if (val1!=val2) {
			System.out.println(val1 + " is not equal to " + val2);
		} else if (val1==val2) {
			System.out.println(val1 + " is not equal to " + val2);
		} 

	}

}
