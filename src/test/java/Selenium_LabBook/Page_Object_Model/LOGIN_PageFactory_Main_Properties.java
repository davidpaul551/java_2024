package Selenium_LabBook.Page_Object_Model;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.time.Duration;
import com.opencart.utilities.ReadConfig;


public class LOGIN_PageFactory_Main_Properties {

    @Test
    public void login() throws InterruptedException, IOException {
        String projectpath = System.getProperty("user.dir");
        System.out.println("Project path is : "+projectpath);

        // Reading properties file
        Properties prop = new Properties();
        InputStream input = new FileInputStream("C:\\Users\\david.doggala\\eclipse-workspace\\Oct2024\\login.properties");
        prop.load(input);
        String str_url = prop.getProperty("url");
        String uname = prop.getProperty("username");
        String pass = prop.getProperty("password");

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        
        // Initialize Login_PageFactory correctly
        Login_PageFactory obj = new Login_PageFactory(driver);  // Pass the driver directly
  // Pass driver directly to the constructor

        JavascriptExecutor js = (JavascriptExecutor) driver;
        
        // Navigate to the URL
        driver.get(str_url);  // Use the URL from properties file
        driver.manage().window().maximize();
        
        // Wait for email field to be visible
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("input-email")));
        
        // Interact with the page
        obj.enterUserName(uname);  // Pass the username from the properties file
        obj.enterPassword(pass);  // Pass the password from the properties file
        js.executeScript("window.scrollBy(0, 300);");  // Scroll to see the login button
        obj.clickloginbutton();  // Click the login button
        
        // Wait for a while before closing the browser
        Thread.sleep(3000);
        driver.quit();  // Close the browser
    }
}
