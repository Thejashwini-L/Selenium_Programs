package Selenium_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon_Registration {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();

		WebElement Accountandlists = driver.findElement(By.xpath("//span[@class='nav-line-2 ']"));
		Actions a1 = new Actions(driver);
		a1.moveToElement(Accountandlists).perform();// target element is AccountandLists on which we hover over
		WebElement signin = driver.findElement(By.xpath("//span[.='Sign in']"));
		signin.click();
		WebElement create_account = driver.findElement(By.id("auth-create-account-link"));
		create_account.click();

		WebElement username = driver.findElement(By.id("ap_customer_name"));
		username.sendKeys("thejashwini");
		WebElement phonenum = driver.findElement(By.id("ap_phone_number"));
		phonenum.sendKeys("9986125935");
		WebElement password = driver.findElement(By.id("ap_password"));
		password.sendKeys("thej@123");

		WebElement verify_mobile = driver.findElement(By.id("continue"));
		verify_mobile.click();

	}

}
