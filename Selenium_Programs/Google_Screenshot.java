package Selenium_Programs;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Google_Screenshot {

	public static void main(String[] args) throws IOException, InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.in");
		driver.manage().window().maximize();
		WebElement search = driver.findElement(By.xpath("(//textarea)[1]"));
		search.sendKeys("India");
		search.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		
		TakesScreenshot a1 = driver;//upcasting driver to TakeScreenshot interface, which ever we want to upcast should be in right side
		File source = a1.getScreenshotAs(OutputType.FILE);//getscreenshot is abs method with para as OutputType.file
		
		Date d1 = new Date();
		String d2 = d1.toString();
		System.out.println(d2);
		String d3 = d2.replace(":", "_");
		//File destination = new File("C:\\Users\\Thejashwini L\\Desktop\\Thejashwini\\ram" + Math.random()+ ".png");
		File destination = new File("C:\\Users\\Thejashwini L\\Desktop\\Thejashwini\\ram".concat(d3) + ".png");
		//creating obj of file class, loc where we want to store along with photo name and extension[png, jpeg, jpg]
		FileHandler.copy(source, destination);//using filehandler class with its static method copy(source, destination)
	}

}
