package com.opencart.testcases;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.opencart.pageobjects.Login_POM;
import com.opencart.testcases.BaseClass;
import com.opencart.utilities.ReadConfig;
import com.opencart.utilities.ReadExcelData;

import Selenium_LabBook.Page_Object_Model.Login_PageFactory;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Login_PageFactory_EXCEL_extentReport extends BaseClass{
    

	

	@Test(dataProvider = "login", dataProviderClass = ReadExcelData.class)
	void login(String uname, String pword) throws InterruptedException, IOException {
		
		SimpleDateFormat DF = new SimpleDateFormat("yyyyMMdd_HHmmss");
		String timestamp = DF.format(new Date(0));
		
	    String projectpath = System.getProperty("user.dir");
	    System.out.println("Project path is : " + projectpath);

	    // Test Reports
	    ExtentReports extent = new ExtentReports();
	    ExtentSparkReporter spark = new ExtentSparkReporter("C:\\Users\\david.doggala\\eclipse-workspace\\Oct2024\\Reports\\r1.html");
	    extent.attachReporter(spark);
	    ExtentTest test = extent.createTest("verifying my title");

	    String url = ReadConfig.geturl();
	    setup(url); // Calls the setup method from BaseClass, which initializes driver

	    Login_POM obj = new Login_POM(driver);
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    
	    Thread.sleep(3000);
	    driver.navigate().refresh();
	    
	    

	    if (driver.getTitle().equals("Account Logi")) {
	        test.pass("Title is Matched");
	    } else {
	        test.fail("Title is not matched");

	        File ssfile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	        FileUtils.copyFile(ssfile, new File("C:\\Users\\david.doggala\\eclipse-workspace\\Oct2024\\Snapshots\\s1.jpg"));
	        test.fail("Title is not matched " + test.addScreenCaptureFromPath("C:\\Users\\david.doggala\\eclipse-workspace\\Oct2024\\Snapshots\\s1.jpg"));
	    }

	    
	    Thread.sleep(5000);

	    obj.enterUserName(uname); // Use unmae instead of uname
	    Thread.sleep(1000);
	    obj.enterPassword(pword);
	    Thread.sleep(3000);
	    js.executeScript("window.scrollBy(0, 300);");
	    obj.clickloginbutton();
	    Thread.sleep(10000);

	    driver.quit();  // Close the driver after each iteration if you want to perform multiple logins
	    extent.flush();
	    
	teardown();
	}
}

