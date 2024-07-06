package Selenium_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class BankingApplication_F12 //automating the banking application where rc will not work so we should 
//typef12 or fn+f12 - to inspect elements
{
	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
		
		driver.findElement(By.linkText("CONTINUE TO LOGIN")).click();
		driver.findElement(By.id("username")).sendKeys("thejashwini");
		driver.findElement(By.name("password")).sendKeys("theju@123");
		driver.findElement(By.name("loginCaptchaValue")).sendKeys("ashwini");
		
		//driver.findElement(By.id("Button2")).click();
		
		
	}

}
