package com.opencart.testcases;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.opencart.utilities.ReadConfig;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
    public static WebDriver driver;

    public void setup(String url) throws IOException {
    	 // Create an instance of ReadConfig to call non-static methods
        ReadConfig config = new ReadConfig(); // Initialize ReadConfig

        // Get URL and browser type from properties file
        String configurl = config.geturl(); // Retrieve URL from properties file
        String browsername = config.getbrowser(); // Retrieve browser from properties file
        

        // Initialize WebDriver based on the browser choice
        switch (browsername.toLowerCase()) {
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
            case "edge":
                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver();
                break;
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;
            default:
                throw new IllegalArgumentException("Browser not supported: " + browsername);
        }

        driver.get(configurl);
        driver.manage().window().maximize(); // Maximize the browser window if needed
    }

    @AfterClass
    public void teardown() {
        if (driver != null) {
            driver.quit(); // Close the browser after tests
        }
    }
}
