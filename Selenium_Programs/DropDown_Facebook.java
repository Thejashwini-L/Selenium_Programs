package Selenium_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown_Facebook {

	public static void main(String[] args) 
	{
      ChromeDriver driver = new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("https://www.facebook.com/signup");
      WebElement date = driver.findElement(By.id("day"));
      Select sc1 = new Select(date);
      sc1.selectByVisibleText("13");
      
      WebElement month = driver.findElement(By.id("month"));
      Select sc2 = new Select(month);
      sc2.selectByValue("12");
      
      WebElement year = driver.findElement(By.id("year"));
      Select sc3 = new Select(year);
      sc3.selectByIndex(28);
      



	}

}
