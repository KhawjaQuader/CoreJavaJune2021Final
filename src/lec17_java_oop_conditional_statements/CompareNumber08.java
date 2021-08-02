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
// && called logical and operator
// logical or operator || (pipe)

public class CompareNumber08 {

	public static void main(String[] args) {
		int val1 = 45;
		int val2 = 45;

		if (val1 % 2 == 0 && val1 < val2) {
			System.out.println(val1 + " is an even number and shorter than " + val2);
		}else if (val1 % 2 == 0 && val1 > val2){
			System.out.println(val1 + " is an even number and greater than " + val2);
		} else if (val1 % 2 == 1 && val1 < val2) {
			System.out.println(val1 + " is an odd number and shorter than " + val2);
		} else if (val1 % 2 == 1 && val1 > val2) {
			System.out.println(val1 + " is an odd number and greater than " + val2);
		} else if (val1 % 2 == 0 && val1 != val2) {
			System.out.println(val1 + " is an even number and not equal to " + val2);
		}else if (val1 % 2 == 0 && val1 == val2) {
			System.out.println(val1 + " is an even number and equal to " + val2);
		}else if (val1 % 2 == 1 && val1 != val2) {
			System.out.println(val1 + " is an odd number and not equal to " + val2);
		} else if (val1%2==1 && val1>=val2) {
			System.out.println(val1 + " is an odd number and (greater than or)  equal to " + val2);
		}else {
			System.out.println("This is not a vlid case");
		}
	}
}
