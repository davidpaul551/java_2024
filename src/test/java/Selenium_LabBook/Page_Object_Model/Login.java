package Selenium_LabBook.Page_Object_Model;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		Login_POM obj = new Login_POM(driver);
		JavascriptExecutor js =  (JavascriptExecutor)driver;


		driver.get("https://demo.opencart.com/en-gb?route=account/login");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(5000);
		//driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("pauldavid551@gmail.com");
		obj.enterUserName("pauldavid551@gmail.com");
		Thread.sleep(1000);

		//driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("David@123");
		obj.enterPassword("David@123");
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//*[@id=\"form-login\"]/div[3]/button")).click();
		js.executeScript("window.scrollBy(0, 300);");
		obj.clickloginButton();
		
		 
		  


	}

}
