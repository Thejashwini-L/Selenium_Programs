package Selenium_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown_GroTechMinds {

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/dropdown/");
		driver.manage().window().maximize();
		
		WebElement question1 = driver.findElement(By.id("Choice1"));
		Select sc = new Select(question1);
		sc.selectByVisibleText("Demo2");
		
		WebElement question2 = driver.findElement(By.id("Choice2"));
		Select sc1 = new Select(question2);
		sc1.selectByValue("practice15");
		
		WebElement question3 = driver.findElement(By.id("Choice3"));
		Select sc2 = new Select(question3);
		sc2.selectByValue("Power10");
		
		WebElement question4 = driver.findElement(By.id("Choice4"));
		Select sc3 = new Select(question4);
		sc3.selectByVisibleText("Energy15");
		
	}

}
