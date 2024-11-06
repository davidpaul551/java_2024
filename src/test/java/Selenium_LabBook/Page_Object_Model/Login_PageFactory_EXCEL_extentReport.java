
package Selenium_LabBook.Page_Object_Model;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

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

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login_PageFactory_EXCEL_extentReport {
    @Test
    public void login() throws InterruptedException, IOException {
        String projectpath = System.getProperty("user.dir");
        System.out.println("Project path is : " + projectpath);
        //Test Reports
        ExtentReports extent = new ExtentReports();
        ExtentSparkReporter spark = new ExtentSparkReporter("r1.html");
        extent.attachReporter(spark);
        ExtentTest test = extent.createTest("verifying my title");

        FileInputStream input = new FileInputStream("C:\\Users\\david.doggala\\eclipse-workspace\\Oct2024\\Login.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(input);

        // Print available sheet names for debugging
        System.out.println("Available sheets:");
        for (int i = 0; i < workbook.getNumberOfSheets(); i++) {
            System.out.println(workbook.getSheetName(i));
        }

        // Check if the sheet exists
        Sheet sheet = workbook.getSheet("Login");
        if (sheet == null) {
            System.out.println("The sheet 'Login' was not found in the Excel file.");
            workbook.close();
            return;
        }

        int noofrows = sheet.getPhysicalNumberOfRows();
        System.out.println("Rows: " + noofrows);

        for (int i = 0; i < noofrows; i++) {
            String url = sheet.getRow(i).getCell(0).getStringCellValue();
            String uname = sheet.getRow(i).getCell(1).getStringCellValue();
            String pword = sheet.getRow(i).getCell(2).getStringCellValue();

            System.out.println("URL: " + url);
            System.out.println("Username: " + uname);
            System.out.println("Password: " + pword);

            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            Login_PageFactory obj = PageFactory.initElements(driver, Login_PageFactory.class);
    		JavascriptExecutor js =  (JavascriptExecutor)driver;


            driver.get(url);
            
            if(driver.getTitle().equals("Account Logi")) {
            	test.pass("Title is Matched");
            }else {
            	test.fail("Title is not matched");
            	
            	File ssfile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            	FileUtils.copyFile(ssfile, new File("s1.jpg"));
            	test.fail("Title is not matched "+test.addScreenCaptureFromPath("s1.jpg"));
            }
            driver.manage().window().maximize();
            Thread.sleep(3000);
            driver.navigate().refresh();
            Thread.sleep(5000);

            obj.enterUserName(uname);
            Thread.sleep(1000);
            obj.enterPassword(pword);
            Thread.sleep(3000);
            js.executeScript("window.scrollBy(0, 300);");
    		obj.clickloginButton();
    		Thread.sleep(4000);
            driver.quit();            	// Close the driver after each iteration if you want to perform multiple logins
            extent.flush();
        }
         workbook.close();// Make sure to close the workbook
    }
}

