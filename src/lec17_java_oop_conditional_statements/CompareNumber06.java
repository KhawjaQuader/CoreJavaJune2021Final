package lec17_java_oop_conditional_statements;

//First condition is if
// we don't use 2 if condition, rather we use if in one condition and else in another condition, but one if condition is ok.
// Generally the true statement comes at the end
//when we write else, no condition is necessary
// if we wanna write a second condition , we have to use else if
// == equality operator
// != not equal to
// 11 divided by 2= result: 5?, remainder/modulus=1
// % called modulus or remainder

public class CompareNumber06 {

	public static void main(String[] args) {
		int val = 45;

		if (val % 2 == 0) {
			System.out.println(val + "is an even number");
		} else if (val % 2 == 1) {
			System.out.println(val + "is an odd number");
		}

	}

}
