package Selenium_Programs;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Launch_Browser {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();//ChromeDriver is class in the Jr files which we configured
		//EdgeDriver driver1 = new EdgeDriver();
		//Thread.sleep(2000);
		driver.manage().window().maximize();
		//Thread.sleep(2000);
		//driver.manage().window().minimize();
		driver.get("https://www.amazon.in");//https - protocol is must 
		System.out.println(driver.getWindowHandle());//will get the browser id, which keeps on changing everytime
		System.out.println(driver.getWindowHandles());
		String title = driver.getTitle();
		System.out.println(title);
		//driver.close();
		
	}

}
