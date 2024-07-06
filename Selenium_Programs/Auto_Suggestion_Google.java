package Selenium_Programs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auto_Suggestion_Google {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
		WebElement search = driver.findElement(By.name("q"));
        search.sendKeys("India");
        Thread.sleep(2000);//so that the execution will be paused till we get the count of auto suggestion
        
        List<WebElement> autosuggestion = driver.findElements(By.xpath("//div[@class='OBMEnb']/ul/li"));//traversed from grandparent/parent/child tag name
        int count = autosuggestion.size();
        System.out.println(count);
        autosuggestion.get(4).click();//get the suggestion at index 4 and click, indexing 4 means element 5 in autosuggestion
        //autosuggestion.get(count-1).click();//9th index, 10 or last option will be selected

	}

}
