package Selenium_LabBook.Page_Object_Model;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LOGIN_PageFactory_Main_Properties {
	@Test

	public  void login() throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		String projectpath = System.getProperty("user.dir");
		System.out.println("Project path is : "+projectpath);
		
		Properties prop = new Properties();
		InputStream input = new FileInputStream("C:\\Users\\david.doggala\\eclipse-workspace\\Oct2024\\login.properties");
		prop.load(input);
		String str_url = prop.getProperty("url");
		String uname = prop.getProperty("username");
		String pass = prop.getProperty("password");
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		Login_PageFactory obj = PageFactory.initElements(driver,Login_PageFactory.class);
		
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
