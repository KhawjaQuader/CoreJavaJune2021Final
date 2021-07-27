package lec15_java_oop_use_of_super_class;

public class TestEmployee {

	public static void main(String[] args) {
		Employee employee = new Employee(); //default constructor initialize
		Employee employee1 = new Employee("Tofael", 483, 'M', false); //parameterized constructor initialize
		employee1.empInfo(); // void type method initialize
		employee1.info("Sharkar", 228145, 'M', true); // void type parameterized method initialize
		
		System.out.println("------------------------------------------------------------------------------\n");
		
		
		MountSinai mountSinai = new MountSinai();		
		MountSinai mountSinai1 = new MountSinai("We care about your health", 10000);	
		mountSinai1.mountsinaiInfo();
		mountSinai1.mountSinai("Health is wealth", 2000);
		mountSinai1.empInfo();
		mountSinai1.info("Kabir", 56754, 'M', false);

	}

}
