package Selenium_Programs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestion_PharmacyApplication {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.cureka.com/");
		driver.manage().window().maximize();
		
		WebElement search = driver.findElement(By.name("s"));
		search.sendKeys("dexolac");
		Thread.sleep(2000);
		List<WebElement> autosuggestion = driver.findElements(By.xpath("//div[@class='dgwt-wcas-content-wrapp']/div/span"));
		int count = autosuggestion.size();
		System.out.println(count);
		
		autosuggestion.get(4).click();
	}

}
