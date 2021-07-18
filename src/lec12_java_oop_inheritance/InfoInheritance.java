package lec12_java_oop_inheritance;

/* 
 
 1. Write down the OOP features.
-- Abstraction, Inheritance, Encapsulation and Polymorphism are the features of java OOP.

2. What is Inheritance? 
-- Inheritance is a mechanism where a new class inherit the properties and methods of other classes. 
-- Parents class: The class from which a subclass/child class is derived is called a parent class or base class or superclass. 
(All the examples are based on the class created on the package, please see code forst to understand them)
Example: GrandFather class is a Parent class/Super Class/Base class for Father, Uncle and Aunt. 
-- Child class: A class derived from another class is called a Child class or Sub class.
Example: Father, uncle, aunt is child class of parent class (Grandfather) 
 
 More example: a. Father is parent class, me, my brother, my sister is child class of parent class (Father)
 					   b. Me is parent class, my daughter is child class of Me.

3. What are the types of Inheritance?
-- Single Inheritance: When a derived class inherit properties and behavior from a single parent class/base class/superclass, it is called as single inheritance.
Example: Daughter Extends Me or Cousin extends uncle or sister extends Father  - this is called 'Single' inheritance

-- Multi-Level Inheritance: A derived class is created from another derived class is called Multi Level Inheritance.
Example: Daughter Extends Me, Me extends father, Father extends GrandFather - they are called ' Multilevel inheritance

-- Hierarchical Inheritance: More than one derived class are created from a single base class is called Hierarchical Inheritance.
Example: Father extends Grandfather, Uncle extends Grandfather, Aunt extends Grandfather - they are called 'Hierarchical' inheritance

-- Multiple Inheritance: Classes that combine aspects of multiple classes and their corresponding hierarchies. 
Example: I am inherited from dad class and mom class.

4. Which keyword is used by the child class to inherit the property of parent class?
-- extends keyword.

5. Does java support multiple Inheritance?
-- To avoid ambiguity error and to reduce the complexity java does not support multiple inheritance. 

*/

public class InfoInheritance {

}
