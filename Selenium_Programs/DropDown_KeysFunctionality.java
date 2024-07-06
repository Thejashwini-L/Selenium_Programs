package Selenium_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown_KeysFunctionality {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		
		WebElement dd = driver.findElement(By.id("searchDropdownBox"));
		dd.sendKeys(Keys.ARROW_DOWN);
		dd.sendKeys(Keys.ARROW_DOWN);
		dd.sendKeys(Keys.ARROW_DOWN);
		dd.sendKeys(Keys.ARROW_DOWN);
		dd.click();
	}

}
