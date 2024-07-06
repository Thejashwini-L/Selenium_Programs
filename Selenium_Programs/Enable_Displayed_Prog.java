package Selenium_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Enable_Displayed_Prog {

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
		WebElement search = driver.findElement(By.name("q"));
        if(search.isDisplayed() && search.isEnabled())
        {
        	search.sendKeys("India");
        }
	}

}
