package test.Login;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


	public class TestLogin {
	
	WebDriver driver;
	
	ChromeOptions options = new ChromeOptions();
	
	
	@BeforeMethod
	public void setup() {
		
		options.addArguments("start-maximized","incognito","--disable-popup-blocking");
		
		driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	
	@AfterMethod
	public void tearDown() {
		
		driver.quit();
	}
	
	
	@Test(priority=2)
	public void testFacebook(){
		
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("sonalisingh506@yahoo.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Sonali1@@");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Search Facebook']")).sendKeys("Amit Rawat" + Keys.ENTER);
		driver.findElement(By.linkText("Amit Rawat")).click();
		
		

	}
	
	
	@Test (priority=1)
	public void testTwitter() {
		
		
		driver.get("https://twitter.com/?lang=en");
	}
	
		
}
