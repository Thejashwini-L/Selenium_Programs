package Selenium_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon_Shoe_RelativeXpath {

	public static void main(String[] args) 
	{
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();
		
		Actions ac = new Actions(driver);
		WebElement hoverover = driver.findElement(By.xpath("//span[@class='nav-line-2 ']"));
	    ac.moveToElement(hoverover).perform();
	    WebElement signin = driver.findElement(By.xpath("(//span[.='Sign in'])[1]"));
	    signin.click();
	    WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
	    email.sendKeys("thejashwiniteju13@gmail.com");
	    
	    WebElement email_continue = driver.findElement(By.xpath("//input[@id='continue']"));
	    email_continue.click();
	    
	    WebElement pwd = driver.findElement(By.xpath("//input[@type='password']"));
	    pwd.sendKeys("Teju13@1996");
	    
	    WebElement pwd_continue = driver.findElement(By.xpath("//input[@id='signInSubmit']"));
	    pwd_continue.click();
	  
		WebElement search = driver.findElement(By.xpath("//input[@type='text']"));
		search.sendKeys("shoes");
		search.sendKeys(Keys.ENTER);
	}

}
