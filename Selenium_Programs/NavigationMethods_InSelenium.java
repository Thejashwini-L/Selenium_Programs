package Selenium_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationMethods_InSelenium {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.in");
		driver.manage().window().maximize();
		
		driver.navigate().back();//1
		Thread.sleep(2000);
		driver.navigate().forward();//2
		
		driver.navigate().to("https://www.facebook.com/");//3
		driver.findElement(By.id("email")).sendKeys("thejashwini@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("theju123");
		
		driver.navigate().refresh();//4, nullify the value entered
		

	}

}
