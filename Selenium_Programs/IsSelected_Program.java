package Selenium_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected_Program {

	public static void main(String[] args) 
	{

		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Thejashwini%20L/Desktop/learningHTML1.html");
		driver.manage().window().maximize();
		
		WebElement checkbox = driver.findElement(By.id("321"));
		checkbox.click();
		boolean b1 = checkbox.isSelected();
        if(b1==true)//we can check for radio button as well
        {
        	System.out.println("Checkbox is selected");
        }
        else
        {
        	System.out.println("Not selected");
        }

	}

}
