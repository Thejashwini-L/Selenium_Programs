package Selenium_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Hover_over_Example {

	public static void main(String[] args) 
	{
      EdgeDriver driver = new EdgeDriver();
      driver.get("https://www.amazon.in");
      driver.manage().window().maximize();
      WebElement Accountandlists= driver.findElement(By.xpath("//span[@class='nav-line-2 ']"));
	  Actions a1 = new Actions(driver);
	  a1.moveToElement(Accountandlists).perform();//target element is AccountandLists on which we hover over
	  WebElement signin = driver.findElement(By.xpath("//span[.='Sign in']"));
      signin.click();
      WebElement username = driver.findElement(By.id("ap_email")); 
	  username.sendKeys("thejashwini@gmail.com");
	  WebElement un_continue =driver.findElement(By.id("continue"));
	  un_continue.click();
	  WebElement password = driver.findElement(By.id("ap_password"));
	  password.sendKeys("Teju13@1996");
	  WebElement pwd_continue = driver.findElement(By.id("signInSubmit"));
	  pwd_continue.click();


	}

}
