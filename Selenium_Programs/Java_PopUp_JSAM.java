package Selenium_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Java_PopUp_JSAM {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Thejashwini%20L/Desktop/learningHTML1.html");
		driver.switchTo().alert().accept();//java pop up to accept
		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
		username.sendKeys("Thejashwini");
		
		WebElement hint = driver.findElement(By.xpath("//input[@name='say hello']"));
		hint.sendKeys("party");
		
		WebElement pwd = driver.findElement(By.xpath("//input[@name='password']"));
		pwd.sendKeys("Theju@123");
		
	    WebElement fname = driver.findElement(By.xpath("//input[@name='fname']"));
		fname.sendKeys("Thejashwini");
		
		WebElement checkbox = driver.findElement(By.xpath("//input[@id='321']"));
		checkbox.click();
		
		WebElement whoyouare = driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
		whoyouare.click();
		
		WebElement readytorelocate = driver.findElement(By.xpath("(//input[@type='checkbox'])[4]"));
		readytorelocate.click();
		
		WebElement Relegion = driver.findElement(By.xpath("//select[@id='Relegion']"));
		Select sc = new Select(Relegion);
		sc.selectByVisibleText("Hindu");
	
		WebElement signup = driver.findElement(By.xpath("//input[@value='Sign up']"));
		signup.click();
	



	}

}
