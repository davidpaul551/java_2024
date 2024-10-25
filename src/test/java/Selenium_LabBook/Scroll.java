package Selenium_LabBook;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scroll {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		JavascriptExecutor js =  (JavascriptExecutor)driver;
		//Scroll to the bottom of the page
		//js.executeScript("window.scrollTo(0,document.body.scrollHeight);");
		//Thread.sleep(3000);
		//Scroll to specific pixels
		//js.executeScript("window.scrollBy(0, 300);");
		//Scroll top
		//js.executeScript("window.scrollTo(0, 0);");
		///Scroll to an element
		//WebElement newsletter = driver.findElement(By.xpath("/html/body/footer/div/div/div[4]/ul/li[4]/a"));
		//js.executeScript("arguments[0].scrollIntoView(true);", newsletter);
		
		
        
		
		

	}

}
