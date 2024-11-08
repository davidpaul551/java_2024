package Selenium_LabBook.Page_Object_Model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Keyword_Driven {

	public static void main(String[] args) throws IOException, InterruptedException {
		String projectpath = System.getProperty("user.dir");
        System.out.println("Project path is : " + projectpath);

        FileInputStream input = new FileInputStream("C:\\Users\\david.doggala\\eclipse-workspace\\Oct2024\\organizer.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(input);
        XSSFSheet sheet = workbook.getSheet("Module");

        int noofrows = sheet.getPhysicalNumberOfRows();
        System.out.println("Rows: " + noofrows);

        for(int i = 0 ; i< noofrows ; i++) {
        	String moduleexe = sheet.getRow(i).getCell(2).getStringCellValue();
        	if(moduleexe.equals("Y")) {
        		String moduleid = sheet.getRow(i).getCell(0).getStringCellValue();
        		System.out.println(moduleid);

        		
        		XSSFSheet testcasesheet = workbook.getSheet("Testcase");
        		int noofrows1 = testcasesheet.getPhysicalNumberOfRows();
        		System.out.println(noofrows1);

        		for(int j = 0 ; j < noofrows1 ; j++) {
        			String testcase_moduleid = testcasesheet.getRow(j).getCell(3).getStringCellValue();
        			String testcase_moduleexe = testcasesheet.getRow(j).getCell(2).getStringCellValue();
        			if(testcase_moduleid.equals(moduleid) && testcase_moduleexe.equals("Y")) {
        				String testcaseid = testcasesheet.getRow(j).getCell(0).getStringCellValue();
        				System.out.println(testcaseid);
        				
        				

        				XSSFSheet teststepsheet = workbook.getSheet("Teststep");
        				int noofrows2 = teststepsheet.getPhysicalNumberOfRows();
        				System.out.println(noofrows2);
        				
        				for(int k = 0 ; k < noofrows2 ; k++) {
        					String teststep_testcaseid = teststepsheet.getRow(k).getCell(4).getStringCellValue();
        					String keywords = teststepsheet.getRow(k).getCell(3).getStringCellValue();

        					if(teststep_testcaseid.equals(testcaseid)) {
        						switch(keywords) {
        						case "ln":
        							login();
        							break;
        						case "ca":
        							close();
        							break;
        						}
        						System.out.println(teststep_testcaseid);
        					}
        				}
        			}
        		}
        	}
        }

        workbook.close();
        input.close();
	}

	public static void login() throws InterruptedException, IOException {
		System.out.println("This is login method");
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
         workbook.close();
	}

	public static void close() {
		System.out.println("This is close method");
	}
}
