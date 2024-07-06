package Selenium_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RegistrationForm_FileUpload_PopUp {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/registration/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		WebElement fname = driver.findElement(By.id("fname"));
		fname.sendKeys("Thejashwini");
		
		WebElement lname = driver.findElement(By.id("lname"));
		lname.sendKeys("L");
		
		WebElement Email = driver.findElement(By.id("email"));
		Email.sendKeys("thejashwiniteju13@gmail.com");
		
		WebElement pwd = driver.findElement(By.id("password"));
		pwd.sendKeys("Luckythebestdog@23");
		
		WebElement radio_button = driver.findElement(By.id("Female"));
		radio_button.click();
		
		WebElement skill_dropdown =  driver.findElement(By.id("Skills"));
		Select sc = new Select(skill_dropdown);
		sc.selectByVisibleText("Technical Skills");
		
		WebElement tskill_dropdown =  driver.findElement(By.id("technicalskills"));
		Select sc1 = new Select(tskill_dropdown);
		sc1.selectByVisibleText("Python");
		
		WebElement country_dropdown =  driver.findElement(By.id("Country"));
		Select sc2 = new Select(country_dropdown);
		sc2.selectByVisibleText("India");
		
		WebElement present_address = driver.findElement(By.id("Present-Address"));
		present_address.sendKeys("JP Nagar");
		
		WebElement parmanent_address = driver.findElement(By.id("Permanent-Address"));
		parmanent_address.sendKeys("same as mentioned");
		
		WebElement pincode = driver.findElement(By.id("Pincode"));
		pincode.sendKeys("560078");
		
		WebElement relegion =  driver.findElement(By.id("Relegion"));
		Select sc3 = new Select(relegion);
		sc3.selectByIndex(1);
		
		WebElement Choose_File = driver.findElement(By.id("file"));
		Choose_File.sendKeys("C:\\Users\\Thejashwini L\\Downloads\\Selenium.txt");
		
		WebElement readytorelocate_checkbox = driver.findElement(By.id("relocate"));
		readytorelocate_checkbox.click();
		
		WebElement submit = driver.findElement(By.name("Submit"));
		submit.click();
		
		driver.switchTo().alert().accept();
		
		
		

	}

}
