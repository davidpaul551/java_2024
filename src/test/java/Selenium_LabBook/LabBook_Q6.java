package Selenium_LabBook;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LabBook_Q6 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.opencart.com/");
		
		driver.manage().window().maximize();

		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"top\"]/div/div[2]/ul/li[2]/div/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Login")).click();
		Thread.sleep(2000);
		WebElement inputemail =driver.findElement(By.id("input-email"));
		inputemail.sendKeys("pauldavid551@gmail.com");
		Thread.sleep(3000);
		WebElement inputpassword = driver.findElement(By.id("input-password"));
		inputpassword.sendKeys("David@123");
		Thread.sleep(3000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 300);");
		System.out.println("Hi");
		driver.findElement(By.linkText("Login")).click();
		
		
       /*
        WebElement element = driver.findElement(By.xpath("//*[@id=\"yt001-widget-reward\"]/div/div[3]/div/div[1]"));
        element.click();
        Thread.sleep(3000);
		driver.findElement(By.linkText("Shop By Brand")).click();
        driver.findElement(By.linkText("Arduino")).click();

     // Scroll down by 250 pixels
        js.executeScript("window.scrollBy(0, 500);");
        driver.findElement(By.id("CardLink-template--16854995665120__product-grid-6803376767129")).click();
        js.executeScript("window.scrollBy(0, 600);");
        Thread.sleep(3000);
	    driver.findElement(By.xpath("//*[@id=\"yt001-widget-reward\"]/div/div[3]/div[2]/div[2]/button")).click();
	    System.out.println("hi");
	    */
       
     

        

	}

}
