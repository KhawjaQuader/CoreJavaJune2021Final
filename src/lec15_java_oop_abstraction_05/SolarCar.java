package lec15_java_oop_abstraction_05;

// we can also use implements to inherit
public abstract class SolarCar extends Mercedes {
	public void solarInfo() {
		System.out.println("Run by solar energy");
	}
	public abstract void speed();

}
