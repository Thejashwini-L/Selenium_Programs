package Selenium_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSAM_Isdisplayed_Isselected_Isenabled {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Thejashwini%20L/Desktop/learningHTML1.html");
		driver.manage().window().maximize();
		
		WebElement lname = driver.findElement(By.name("lname"));
	
		if((lname.isDisplayed() && lname.isEnabled())==true)
		{
			System.out.println("Is Enabled and displayed");
		}
		else
		{
			System.out.println("Is displayed but not enabled");
		}
		
		WebElement whoyouare = driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
		whoyouare.click();
		boolean radio_button = whoyouare.isSelected();
		if(radio_button==true)
		{
			System.out.println("Is selected");
		}
		else
		{
			System.out.println("Is not selected");
		}

	}

}
