package Selenium_Programs;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Naukri_Movingcontrol {

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=23531&wExp=N&utm_source=google&utm_medium=cpc&utm_campaign=Brand&gad_source=1&gclid=EAIaIQobChMIwbGzr8TBhgMVT4FLBR0mogA-EAAYASAAEgKzVfD_BwE&gclsrc=aw.ds");
		driver.manage().window().maximize();
		
		WebElement loginthroughgoogle = driver.findElement(By.xpath("//span[.='Google']"));
		loginthroughgoogle.click();
		
		Set<String> id=driver.getWindowHandles();//return type is Set of string for get window handles
		Iterator<String> id1 = id.iterator();//id have set of string, rt of iterator is iterator of string
		String pid = id1.next();//gives the first string present
		String cid = id1.next();//gives the next string present
		System.out.println(pid);
		System.out.println(cid);
		
		driver.switchTo().window(cid);
		
		driver.close();//child gets closed as control moved from parent to child
	}

}
