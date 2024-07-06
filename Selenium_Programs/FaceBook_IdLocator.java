package Selenium_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class FaceBook_IdLocator {

	public static void main(String[] args) 
	{
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("thejashwini@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("theju123");
		driver.findElement(By.name("login")).click();
		//whether the test case pass/fail will be decided by assertion
		
		

	}

}
