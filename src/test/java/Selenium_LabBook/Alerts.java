package Selenium_LabBook;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
 
public class Alerts {
 
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		//driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		//driver.findElement(By.id("login1")).sendKeys("uname1");
		//driver.findElement(By.name("proceed")).click();
		
		//Alert simplealert= driver.switchTo().alert();
		
		//System.out.println("The Alert Message is :"+simplealert.getText());
		//simplealert.accept();
		
		driver.navigate().to("https://letcode.in/alert");
		//simple alert
		Thread.sleep(2000);
		driver.findElement(By.id("accept")).click();
		Alert simplealert1= driver.switchTo().alert();
		System.out.println("Simple alert message is : "+simplealert1.getText());
		simplealert1.accept();
		//confirmation alert 
		Thread.sleep(2000);
		driver.findElement(By.id("confirm")).click();
		Alert confirmalert  = driver.switchTo().alert();
		System.out.println("Confirmation alert is : "+confirmalert.getText());
		confirmalert.accept();
		//prompt alert
		Thread.sleep(2000);
		driver.findElement(By.id("prompt")).click();
		Alert promptalert = driver.switchTo().alert();
		System.out.println("Alert message is :"+ promptalert.getText());
		promptalert.sendKeys("hi");
		promptalert.accept();

		
		
		

		
		
		
 
	}
 
}
