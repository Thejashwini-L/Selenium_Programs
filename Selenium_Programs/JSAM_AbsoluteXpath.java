package Selenium_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class JSAM_AbsoluteXpath {

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Thejashwini%20L/Desktop/learningHTML1.html");
		driver.switchTo().alert().accept();
		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.xpath("(/html/body/input)[1]"));
		username.sendKeys("Thejashwini Lakkanna");
		
		WebElement hint = driver.findElement(By.xpath("(/html/body/input)[2]"));
		hint.sendKeys("party");
		
		WebElement pwd = driver.findElement(By.xpath("(/html/body/input)[3]"));
		pwd.sendKeys("Theju@123");
		
	    WebElement fname = driver.findElement(By.xpath("(/html/body/form/input)[1]"));
		fname.sendKeys("Thejashwini");
		
		WebElement checkbox = driver.findElement(By.xpath("(/html/body/form/input)[6]"));
		checkbox.click();
		
		WebElement whoyouare = driver.findElement(By.xpath("(/html/body/input)[5]"));
		whoyouare.click();
		
		WebElement readytorelocate = driver.findElement(By.xpath("(/html/body/input)[6]"));
		readytorelocate.click();
		
		WebElement Relegion = driver.findElement(By.xpath("/html/body/select"));
		Select sc = new Select(Relegion);
		sc.selectByVisibleText("Hindu");
	
		WebElement signup = driver.findElement(By.xpath("(/html/body/input)[7]"));
		signup.click();
		
	}

}
