package Selenium_LabBook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.time.Duration;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class mouseHover {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		
		Properties prop = new Properties();
		InputStream input = new FileInputStream("C:\\Users\\david.doggala\\eclipse-workspace\\Oct2024\\login.properties");
		prop.load(input);
		String project_url = prop.getProperty("url1");
		String uname = prop.getProperty("username");
		String pass = prop.getProperty("password");
		
		
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get(project_url);
		driver.manage().window().maximize();
		JavascriptExecutor js =  (JavascriptExecutor)driver;
		//Mouse Hover
		WebElement mensfashion = driver.findElement(By.xpath("//*[@id=\"leftNavMenuRevamp\"]/div[1]/div[2]/ul/li[1]"));
		// Create an instance of Actions class
		Actions act = new Actions(driver);
		// Perform the mouse hover action
		act.moveToElement(mensfashion).build().perform();
		driver.findElement(By.linkText("Sunglasses")).click();
		
		//WebElement sunglassfind = driver.findElement(By.xpath("//*[@id=\\\"668637584109\\\"]/div[2]/div[1]/a"));
		//js.executeScript("arguments[0].scrollIntoView(true);", sunglassfind);
		//driver.findElement(By.xpath("//*[@id=\"668637584109\"]/div[2]/div[1]/a")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Step 1: Wait until the element is present in the DOM (even if it's not visible)
        WebElement sunglassfind = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"668637584109\"]/div[2]/div[1]/a")));

        // Step 2: Scroll the element into view using JavaScript
        js.executeScript("arguments[0].scrollIntoView(false);", sunglassfind);
       // Thread.sleep(3000);
        String mainwindowhandle = driver.getWindowHandle();
        
        sunglassfind.click();
        
        Set<String> allwindowhandles  = driver.getWindowHandles();
        for(String handle : allwindowhandles) {
        	if(!handle.equals(mainwindowhandle)) {
        		driver.switchTo().window(handle);
        		break;
        	}
        }
        
        //Thread.sleep(3000);
        WebElement addtocart  = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"add-cart-button-id\"]")));

        // Step 2: Scroll the element into view using JavaScript
        js.executeScript("arguments[0].scrollIntoView(false);", addtocart);
       // Thread.sleep(3000);

        
        addtocart.click();
       // Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"cartProductContainer\"]/div/div[2]/div[2]/div/div[2]/div")).click();
       // Thread.sleep(3000);
        
        WebElement drop = driver.findElement(By.xpath("//*[@id=\"rtbScriptContainer\"]/div[5]/ul/li/div[5]"));
        drop.click();
        WebElement options = driver.findElement(By.xpath("/html/body/div[16]/ul/li[4]"));
        options.click();
        //Select dropname = new Select(drop);
        //dropname.selectByIndex(3);
        
        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement pin = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"pincode-value\"]")));

        // Clear any pre-existing text and enter the pincode
        pin.clear();
        pin.sendKeys("500096");

        // Locate and click the "check" button
        WebElement check = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"send-pincode\"]")));
        check.click();
	}

}
