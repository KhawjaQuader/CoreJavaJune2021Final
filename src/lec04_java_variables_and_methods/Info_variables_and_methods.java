package lec04_java_variables_and_methods;

/*

1) What a class body contain?
class body contain:
			-- i) Variable --- Declared and/or Initialize
			-- ii) Constructor  --- Declared and/or Initialize
			-- iii) Method  --- (not declared) Implemented and/or Initialize

2) What is a Variable?
-- A variable is a container that holds values that are used in a Java program. 
-- Every variable must be declared to use a data type. 

3) What are the most commonly used variables?
-- String, int, char, boolean, double.

4) what does it mean by -- variable declared?
-- it means we did not assign value for variables.

5) what does it mean by -- variable initialized?
-- it means we assign value for variables.

6) what are the Info about String type variables?
-- String type variable start with Upper case, String type variable is inside double quotation

7) what are the Info about int (called Integer) type variables?
-- int type variable start with lower case, int type variable doesn't have any quotation

8) what are the Info about char type variables?
-- char type variable start with lower case,char type variable is inside single quotation

9) what are the Info about boolean type variables?
-- boolean type variable start with lower case, boolean type variable doesn't have any quotation, only true or false.

10) Can you call a non static variable or method inside main method?
-- a non static variable (or non-static method) can't call inside a main method (which is a static method).
-- solve 2 way -- i) By making the variables static outside the main method
						ii) Or by moving (initialized) the variables inside the  main method 



 * */

public class Info_variables_and_methods {

	public static void main(String[] args) {
		System.out.println("\"Info regarding Variable and Method\"");

	}

}
