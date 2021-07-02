package lec05_02_java_variables_declared_methods_and_constructor_07012021;

public class TestMyInfo {

	public static void main(String[] args) {
		MyInfo tofael = new MyInfo(); 
		tofael.MyName = "Tofael";
		tofael.myAge = 46;
		tofael.mySex = 'M';
		tofael.usaCitizen = false;
		tofael.myWorkingYear = 17;
		tofael.myHouseRent = 23345;
		tofael.myYearlySalary = 623545278786l;
		tofael.myGrade = 3.122f;
		tofael.myHeight = 1.7636847628364;		
		tofael.myInfo();
		System.out.println("*******************************************************************************");
		
		MyInfo anwar = new MyInfo(); 
		anwar.MyName = "Anwar";
		anwar.myAge = 41;
		anwar.mySex = 'M';
		anwar.usaCitizen = true;
		anwar.myWorkingYear = 8;
		anwar.myHouseRent = 23367;
		anwar.myYearlySalary = 623545654786l;
		anwar.myGrade = 3.672f;
		anwar.myHeight = 1.7636867828364;		
		anwar.myInfo();
		System.out.println("*******************************************************************************");
		
		
		MyInfo bill = new MyInfo(); 
		bill.MyName = "Bill";
		bill.myAge = 41;
		bill.mySex = 'M';
		bill.usaCitizen = true;
		bill.myWorkingYear = 8;
		bill.myHouseRent = 23367;
		bill.myYearlySalary = 623545654786l;
		bill.myGrade = 3.672f;
		bill.myHeight = 1.7636867828364;		
		bill.myInfo();
		
		

	}

}
