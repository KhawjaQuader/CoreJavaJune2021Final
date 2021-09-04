package lec29_java_selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A_use_of_get_method {

	public static void main(String[] args) {
		// System is a class and setProperty is a method
		System.setProperty("webdriver.chrome.driver", "/Users/mohammadsharkar/Downloads/chromedriver");
		// WebDriver is an interface and ChromeDriver is a concrete class
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		driver.quit();
	}

}
// hi
