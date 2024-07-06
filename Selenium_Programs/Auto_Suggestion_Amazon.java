package Selenium_Programs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Auto_Suggestion_Amazon {

	public static void main(String[] args) throws InterruptedException 
	{
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();
		
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
        search.sendKeys("shoes");
        Thread.sleep(2000);
        
        List<WebElement> autosuggestion = driver.findElements(By.xpath("//div[@class='two-pane-results-container']/div/div"));//traversed from grandparent/parent/child tag name
        //till you get 1 0f 10
        int count = autosuggestion.size();
        System.out.println(count);
        autosuggestion.get(4).click();

	}

}
