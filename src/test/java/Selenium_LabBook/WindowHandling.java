package Selenium_LabBook;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/windows");
		
		driver.manage().window().maximize();
		System.out.println(driver.getWindowHandle());
		
		driver.findElement(By.id("multi")).click();
		List<String > windowHandling = new ArrayList(driver.getWindowHandles());
		for(String i : windowHandling) {
			System.out.println(i);
		}
		driver.switchTo().window(windowHandling.get(0));
		System.out.println("url is : "+driver.getCurrentUrl());
		
		driver.switchTo().window(windowHandling.get(1));
		System.out.println("url is : "+driver.getCurrentUrl());
		
		driver.switchTo().window(windowHandling.get(2));
		System.out.println("url is : "+driver.getCurrentUrl());
	
		
        JavascriptExecutor js = (JavascriptExecutor) driver;

	}

}
