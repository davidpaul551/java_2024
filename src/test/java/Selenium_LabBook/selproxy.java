package Selenium_LabBook;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.Scanner;

public class selproxy {
    public static void main(String[] args) throws InterruptedException {
        // Set up WebDriver
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        // Navigate to the registration page
        driver.get("https://demo.opencart.com/en-gb?route=account/register");
        driver.manage().window().maximize();

        // Wait for user to enter the first name
        System.out.println("Please enter your first name in the browser and press Enter in the console...");
        new Scanner(System.in).nextLine();  // Wait for user input

        // Wait for user to enter the last name
        System.out.println("Please enter your last name in the browser and press Enter in the console...");
        new Scanner(System.in).nextLine();  // Wait for user input

        // Scroll to the bottom of the page
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
        Thread.sleep(4000);

        // Click on the continue button
        WebElement continueButton = driver.findElement(By.xpath("//*[@id=\"form-register\"]/div/button"));
        continueButton.click();
        System.out.println("hi");
        Thread.sleep(4000);

        // Verify first name error message
        WebElement errorFirstName = driver.findElement(By.id("error-firstname"));
        if (errorFirstName.isDisplayed()) {
            String actualError = errorFirstName.getText();
            System.out.println(actualError);
            String expectedError = "First Name must be between 1 and 32 characters!";
            if (actualError.equals(expectedError)) {
                System.out.println("True");
            } else {
                System.out.println("False");
            }
        } else {
            System.out.println("No error message for first name");
        }

        // Verify last name error message
        WebElement errorLastName = driver.findElement(By.id("error-lastname"));
        if (errorLastName.isDisplayed()) {
            String actualLastError = errorLastName.getText();
            System.out.println(actualLastError);
            String expectedLastError = "Last Name must be between 1 and 32 characters!";
            if (actualLastError.equals(expectedLastError)) {
                System.out.println("True");
            } else {
                System.out.println("False");
            }
        } else {
            System.out.println("No error message for last name");
        }

        // Close the browser
        driver.quit();
    }
}

