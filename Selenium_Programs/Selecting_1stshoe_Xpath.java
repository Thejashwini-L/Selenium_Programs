package Selenium_Programs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selecting_1stshoe_Xpath {

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();
		
		WebElement search = driver.findElement(By.name("field-keywords"));
		search.sendKeys("shoes");
		driver.findElement(By.id("nav-search-submit-button")).sendKeys(Keys.ENTER);

		List<WebElement> frstshoe = driver.findElements(By.xpath("//a[@class='a-link-normal s-no-outline']/div"));
		frstshoe.get(0).click();
		
	}

}
