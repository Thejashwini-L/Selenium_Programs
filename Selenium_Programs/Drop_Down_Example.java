package Selenium_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_Down_Example {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		
		WebElement category = driver.findElement(By.id("searchDropdownBox"));
		
		Select sc = new Select(category);//creating obj for select class, under select class we don't have no constructor with no para
		//every cons under select cls is param, we should pss the ref var which we got from webelement
       //sc.selectByVisibleText("Books");//->1 way of handling drop down
		//sc.selectByValue("search-alias=appliances");//->2 way of handling drop down
		sc.selectByIndex(1);//->3 way of handling drop down
       
	}

}
