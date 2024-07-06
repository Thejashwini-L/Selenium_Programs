package Selenium_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Link_PartialLink_TextLocator {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://google.co.in");
		WebElement gmail = driver.findElement(By.linkText("Gmail"));
		gmail.click();
		
		System.out.println("============================================");
		
		ChromeDriver driver1=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=155259815513&hvpone=&hvptwo=&hvadid=674842289437&hvpos=&hvnetw=g&hvrand=3148646016007297493&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1007768&hvtargid=kwd-10573980&hydadcr=14453_2316415&gad_source=1");
		WebElement bestsellers = driver.findElement(By.partialLinkText("Sellers"));//while choosing partialliink text we should make sure it is not dupilcate
		bestsellers.click();
		//when the link is so big we go for partial link text
		
		

	}

}
