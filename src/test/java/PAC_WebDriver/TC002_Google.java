package PAC_WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC002_Google {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		WebElement ele = driver.findElement(By.name("q"));
		Thread.sleep(1000);
		ele.sendKeys("Testing methods");
		Thread.sleep(1000);
		ele.submit();
		System.out.println("Title of the page is :"+driver.getTitle());
		
		driver.navigate().to("https://www.yahoo.com/");
		System.out.println("Title of the page is :"+driver.getTitle());
		System.out.println("Current URl is : "+driver.getCurrentUrl());
		driver.navigate().back();
		System.out.println("Title of the page afetr backward is :"+driver.getTitle());
		System.out.println("Current URl is : "+driver.getCurrentUrl());

		driver.navigate().forward();
		System.out.println("Title of the page after forward is :"+driver.getTitle());
		System.out.println("Current URl is : "+driver.getCurrentUrl());
		System.out.println("page Source is : "+ driver.getPageSource());
		System.out.println("Page source is : "+driver.getPageSource().contains("yahoo"));


		//driver.close();
	}

}
