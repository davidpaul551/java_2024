package Selenium_LabBook;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LabBook_Q5 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		//  Part 1: Launch Application
		driver.get("https://demo.opencart.com/en-gb?route=account/register");
		driver.manage().window().maximize();
		/*
		String Actual_Title = driver.getTitle();
		String Expected_Title = "Register Account";
		if(Actual_Title.equals(Expected_Title)) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}
		System.out.println("Title of page is : "+driver.getTitle());
		System.out.println(driver.getPageSource().contains("Register Account"));
		Thread.sleep(5000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
		Thread.sleep(3000);
		WebElement continueButton = driver.findElement(By.xpath("//*[@id=\"form-register\"]/div/button"));
		continueButton.click();
		
		WebElement warning = driver.findElement(By.xpath("//*[@id=\"alert\"]/dirv"));
		warning.isDisplayed();
		System.out.println(warning.getText());
		
		//driver.getPageSource().contains("Warning: You must agree to the Privacy Policy!'");
				
		//WebElement alerts =driver.findElement(By.xpath("//*[@id=\"alert\"]"));
		//System.out.println("Element is :"+alerts.isEnabled());
		 */
		
		
		
		
		
		// Part 2: For 'Your Personal Details'
		//First name
		WebElement inputfirstname = driver.findElement(By.id("input-firstname"));
		inputfirstname.sendKeys("daviddaviddavidd");
		
		Thread.sleep(3000);
		//last name
		WebElement inputlastname = driver.findElement(By.id("input-lastname"));
		inputlastname.sendKeys("daviddaviddavid");
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
		Thread.sleep(3000);
		//Email
        WebElement inputemail = driver.findElement(By.id("input-email"));
		inputemail.sendKeys("davidpaul5512345@gmail.com");
		Thread.sleep(3000);
		//password
		WebElement inputpassword = driver.findElement(By.id("input-password"));
		inputpassword.sendKeys("David@123");
		Thread.sleep(3000);
		//Newsletter
		WebElement newsletter = driver.findElement(By.id("input-newsletter"));
		newsletter.click();
		Thread.sleep(3000);
		//Agree
		WebElement agreecheckbox = driver.findElement(By.xpath("//*[@id=\"form-register\"]/div/div/input"));
		agreecheckbox.click();
		Thread.sleep(3000);
		WebElement continueButton = driver.findElement(By.xpath("//*[@id=\"form-register\"]/div/button"));
		continueButton.click();
		System.out.println("hi");
		Thread.sleep(4000);
		
		
		try {
		    WebElement successMessage = driver.findElement(By.tagName("h1"));
		    if (successMessage.getText().contains("Your Account Has Been Created!")) {
		        System.out.println("Account creation was successful.");
		    } else {
		        System.out.println("Account creation failed.");
		    }
		} catch (NoSuchElementException e) {
		    System.out.println("Success message not found. There may be an issue with account creation.");
		}

		// Now check for error messages, though none are expected with valid inputs
		try {
		    WebElement errorfirstname = driver.findElement(By.id("error-firstname"));
		    if (errorfirstname.isDisplayed()) {
		        String actualError = errorfirstname.getText();
		        System.out.println("Unexpected First Name Error: " + actualError);
		    }
		} catch (NoSuchElementException e) {
		    // No error for first name, which is expected with valid input
		    System.out.println("No error message for first name, as expected.");
		}

		try {
		    WebElement errorlastname = driver.findElement(By.id("error-lastname"));
		    if (errorlastname.isDisplayed()) {
		        String actualLastNameError = errorlastname.getText();
		        System.out.println("Unexpected Last Name Error: " + actualLastNameError);
		    }
		} catch (NoSuchElementException e) {
		    // No error for last name, which is expected with valid input
		    System.out.println("No error message for last name, as expected.");
		}

		try {
		    WebElement erroremail = driver.findElement(By.id("error-email"));
		    if (erroremail.isDisplayed()) {
		        String actualEmailError = erroremail.getText();
		        System.out.println("Unexpected Email Error: " + actualEmailError);
		    }
		} catch (NoSuchElementException e) {
		    // No error for email, which is expected with valid input
		    System.out.println("No error message for email, as expected.");
		}
		
		
		
		
		
		
		
	}
		
	

}
