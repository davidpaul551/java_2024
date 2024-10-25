package Selenium_LabBook;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LabBook_Q6 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//Implicit Wait 
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://demo.opencart.com/");
		
		driver.manage().window().maximize();

		driver.navigate().refresh();
		driver.navigate().refresh();
		//WebElement account = driver.findElement(By.xpath("//*[@id=\"top\"]/div/div[2]/ul/li[2]/div/a"));
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		WebElement account = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"top\"]/div/div[2]/ul/li[2]/div/a")));

		account.click();
		
		//Fluent Wait
		Wait<WebDriver> wait1 = new FluentWait(driver)
			    // Maximum time to wait for a condition (30 seconds)
			    .withTimeout(Duration.ofSeconds(30))
			    // Frequency with which to check for the condition (every 5 seconds)
			    .pollingEvery(Duration.ofSeconds(5))
			    // Ignore exceptions like NoSuchElementException while waiting
			    .ignoring(NoSuchElementException.class);
		
		System.out.println("Hi");
		driver.findElement(By.linkText("Login")).click();
		WebElement inputemail =driver.findElement(By.id("input-email"));
		inputemail.sendKeys("pauldavid551@gmail.com");
		WebElement inputpassword = driver.findElement(By.id("input-password"));
		inputpassword.sendKeys("David@123");
		//JavaScript Executor 
        JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 300);");
		System.out.println("Hi");
		driver.findElement(By.xpath("//*[@id=\"form-login\"]/div[3]/button")).click();
		
		
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
