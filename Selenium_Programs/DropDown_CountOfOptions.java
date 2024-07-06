package Selenium_Programs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown_CountOfOptions {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/dropdown/");
		driver.manage().window().maximize();
		
		WebElement question1 = driver.findElement(By.id("Choice1"));
		Select sc = new Select(question1);
		sc.selectByVisibleText("Demo2");
		
		List<WebElement> count = sc.getOptions();//getOptions is method in Select class to get count of options present in drop down
		System.out.println(count.size());
		

	}

}
