package StepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_Login {
    WebDriver driver;
    JavascriptExecutor js;

    @Given("Launch the browser")
    public void launch_the_browser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        js = (JavascriptExecutor) driver;
    }

    @And("navigate to the URL")
    public void navigate_to_the_url() {
        driver.get("https://demo.opencart.com/en-gb?route=account/login");
    }

    @When("Enter valid username and password")
    public void enter_valid_username_and_password() {
        driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("pauldavid551@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("David@123");
    }

    @When("Enter invalid username and password")
    public void enter_invalid_username_and_password() {
        driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("pauldavid55133@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("David@12344");
    }

    @And("click on the login button")
    public void click_on_the_login_button() throws InterruptedException {
        try {
            js.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath("//*[@id=\"form-login\"]/div[3]/button")));
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"form-login\"]/div[3]/button"))).click();
            Thread.sleep(3000);  // Optional wait for login process
        } catch (Exception e) {
            System.out.println("Error clicking on login button: " + e.getMessage());
        }
    }



    @Then("Verify the login")
    public void verify_login_status() throws InterruptedException {
        Thread.sleep(3000);
        try {
        	js.executeScript("window.scrollBy(0,400);");
            if (driver.findElement(By.linkText("Logout")).isDisplayed()) {
                System.out.println("Login Successful");
            }
        } catch (Exception e) {
            System.out.println("Login Unsuccessful");
        }
    }

    @And("Close the browser")
    public void close_the_browser() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
}
