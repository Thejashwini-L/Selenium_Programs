package Selenium_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook_Signin {

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		WebElement createnewaccount =  driver.findElement(By.linkText("Create new account"));
		createnewaccount.click();
		
		WebElement fname =  driver.findElement(By.name("firstname"));
		fname.sendKeys("thejashwini");
		
		WebElement lname =  driver.findElement(By.name("lastname"));
		lname.sendKeys("l");
		
		WebElement email =  driver.findElement(By.name("reg_email__"));
		email.sendKeys("thejashwini@gmail.com");
		
		WebElement remail =  driver.findElement(By.name("reg_email_confirmation__"));
		remail.sendKeys("thejashwini@gmail.com");
		
		WebElement pwd =  driver.findElement(By.id("password_step_input"));
		pwd.sendKeys("thejashwini@123");
		
		WebElement date =  driver.findElement(By.id("day"));
		
		Select day = new Select(date);
		day.selectByVisibleText("13");
		
        WebElement mon =  driver.findElement(By.id("month"));
		
		Select month = new Select(mon);
		month.selectByValue("12");
		
       WebElement yea =  driver.findElement(By.id("year"));
		
		Select year = new Select(yea);
		year.selectByVisibleText("1996");
		
		
		
	}

}
