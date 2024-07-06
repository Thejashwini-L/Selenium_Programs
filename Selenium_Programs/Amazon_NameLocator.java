package Selenium_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_NameLocator {

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		driver.findElement(By.name("field-keywords")).sendKeys("shoes");
		driver.findElement(By.id("nav-search-submit-button")).sendKeys(Keys.ENTER);

	}

}
