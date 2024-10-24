package Selenium_LabBook;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;

public class warningwait {
    public static void main(String[] args) {
        // Set up WebDriver
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        
        try {
            // Part 1: Launch Application
            driver.get("https://demo.opencart.com/en-gb?route=account/register");
            driver.manage().window().maximize();
            
            // Check Page Title
            String actualTitle = driver.getTitle();
            String expectedTitle = "Register Account";
            System.out.println("Title of page is: " + actualTitle);
            System.out.println("Is title correct? " + actualTitle.equals(expectedTitle));
            System.out.println(driver.getPageSource().contains("Register Account"));
            Thread.sleep(5000);
            
            // Scroll to the bottom of the page
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
            Thread.sleep(3000);
            
            // Click on the Continue button
            WebElement continueButton = driver.findElement(By.xpath("//*[@id=\"form-register\"]/div/button"));
            continueButton.click();

            // Use explicit wait to find the warning message
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement warning = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\\\"alert\\\"]/dirv"))); // Updated XPath
            
            if (warning.isDisplayed()) {
                System.out.println("Warning message is displayed: " + warning.getText());
            }

        } catch (org.openqa.selenium.NoSuchElementException e) {
            System.out.println("Warning message not found.");
        } catch (org.openqa.selenium.TimeoutException e) {
            System.out.println("Warning message did not appear in the expected time.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            // Close the browser
            driver.quit();
        }
    }
}
