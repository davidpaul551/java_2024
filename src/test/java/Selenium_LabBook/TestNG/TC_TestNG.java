package Selenium_LabBook.TestNG;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TC_TestNG {
	WebDriver driver;
  @Test(dataProvider = "dp")
  public void f(String username, String password) throws InterruptedException {
	  Thread.sleep(6000);
	  if(driver.findElement(By.id("input-email")).isDisplayed()) {
	  driver.findElement(By.id("input-email")).sendKeys(username);
	  Assert.assertTrue(true);
	  }else {
		  Assert.assertTrue(false);
	  }
	  if(driver.findElement(By.id("input-password")).isDisplayed()) {
	  driver.findElement(By.id("input-password")).sendKeys(password);
	  Assert.assertTrue(true);
	  }else {
		  Assert.assertTrue(false);
	  }
	  Thread.sleep(3000);
	  if(driver.findElement(By.xpath("//*[@id=\"form-login\"]/div[3]/button")).isDisplayed()) {
	  driver.findElement(By.xpath("//*[@id=\"form-login\"]/div[3]/button")).click();
	  Assert.assertTrue(true);
	  }else {
		  Assert.assertTrue(false);
	  }
	  
	  System.out.println("This is the Test");
	  
  }
  @BeforeMethod
  public void beforeMethod() throws InterruptedException {
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.get("https://demo.opencart.com/en-gb?route=account/login");
	  driver.manage().window().maximize();
	  Thread.sleep(3000);
	  driver.navigate().refresh();

	  System.out.println("This is the @BeforeMethod");
  }

  @AfterMethod
  public void afterMethod() throws InterruptedException {
	  Thread.sleep(3000);
	  JavascriptExecutor js =  (JavascriptExecutor)driver;
	// Scroll to the bottom of the page
	  js.executeScript("window.scrollBy(0,1500);");
	  WebElement logout =driver.findElement(By.xpath("//*[@id=\"column-right\"]/div/a[13]"));
	  js.executeScript("arguments[0].scrollIntoView(false);", logout);
	  Thread.sleep(3000);
	  logout.click();
	  System.out.println("This is the @AfterMethod");
	  driver.close();
  }


  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "pauldavid551@gmail.com", "David@123" },
      new Object[] { "pauldavid551@gmail.com", "b1235" },
    };
  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("This is the @Bforeclass");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("this is the @Afterclass");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("This is the @BeforeTest");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("This is the @AfterTest");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("This is the @BeforeSuite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("This is the @AfterSuite");
  }

}
