package Selenium_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_Selector {

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		//driver.get("https://www.amazon.com");
		driver.manage().window().maximize();
		
		//driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("shoes");//css selector using id, #id_value
		//driver.get("https://www.flipkart.com");
		//driver.findElement(By.cssSelector(".Pke_EE")).sendKeys("shoes");//css selector using class name, .classname_value
		//don't use class name if there is space for css
		
		//driver.get("https://www.google.com");
		//driver.findElement(By.cssSelector("textarea#APjFqb")).sendKeys("shoes");//css selector using tag name and id , tagname#id_value
		
		
		driver.get("https://www.google.com");
		driver.findElement(By.cssSelector("textarea.gLFyf")).sendKeys("shoes");//css selector using tag name and class name , tagname.classname_value
		
		driver.get("https://www.google.com");
		driver.findElement(By.cssSelector("[class='gLFyf']")).sendKeys("shoes");//css selector using attribute name and attribute value
		//[AN='AV']
		
		driver.get("https://www.google.com");
		driver.findElement(By.cssSelector("textarea[class='gLFyf']")).sendKeys("shoes");//css selector using tagname,attribute name and attribute value
		//tagname[AN='AV']
		
		driver.get("https://www.flipkart.com");
		driver.findElement(By.cssSelector("input.Pke_EE[name='q']")).sendKeys("shoes");//css selector using tagname,classname_value, attribute name 
	//and attribute value tagname.classname_value[AN='AV']
		
		driver.get("https://www.amazon.com");
		driver.findElement(By.cssSelector("input[id^='two']")).sendKeys("shoes");//css selector using substring
	//tagname[AN^='substring of AV'], ^ is caret using which we can give partial att value 
		
	}

}
