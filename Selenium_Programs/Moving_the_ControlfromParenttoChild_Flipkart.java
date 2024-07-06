package Selenium_Programs;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Moving_the_ControlfromParenttoChild_Flipkart {

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("shoes");
		search.sendKeys(Keys.ENTER);

		WebElement frstshoe = driver.findElement(By.xpath("(//div[@class='wvIX4U']/div)[1]"));
		frstshoe.click();
		Set<String> s1 = driver.getWindowHandles();//will give id of parent and child browser and rt of getwindowhandles is set<string>
		System.out.println(s1);
		//we need to separate the set of string to parent string and child string, so we make use of iterator concept
		//list of iterator is not applicable for set, it is only for list interface
		Iterator<String> s2 = s1.iterator();
		String parentid = s2.next();//will print the first parent id
		String childid = s2.next();//calling again will print the child id
		System.out.println(parentid);
		System.out.println(childid);
		
		//Thread.sleep(3000);
		//driver.close();closing the parent tab, will not move the contrl from parent to child
		
		driver.switchTo().window(childid);//controlled will be moved to child
		//driver.close();//child window will be closed as the control is  moved to child
		WebElement buynow = driver.findElement(By.xpath("//button[@class ='QqFHMw vslbG+ _3Yl67G _7Pd1Fp']"));
		buynow.click();
		
		

	}

}
