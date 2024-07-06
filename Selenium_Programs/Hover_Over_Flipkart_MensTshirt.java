package Selenium_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Hover_Over_Flipkart_MensTshirt {

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		
		WebElement fasion_hoverover = driver.findElement(By.xpath("(//div[@class='YBLJE4'])[3]"));
		Actions as = new Actions(driver);
		as.moveToElement(fasion_hoverover).perform();
		
       WebElement mens_tshirt = driver.findElement(By.linkText("Men's T-Shirts"));
       mens_tshirt.click();
		
	}

}
