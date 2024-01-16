package test.Login;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class Omayo {
	
	WebDriver driver = new ChromeDriver();
	
	@Test
	public void test() {
		
		driver.get("https://google.com");
	
	}
	

}
