package StepDefinition;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_SnapDeal {
	WebDriver driver;
    JavascriptExecutor js;

	
	@Given("launch the browser")
	public void launch_the_browser() {
	    // Write code here that turns the phrase above into concrete actions
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
        js = (JavascriptExecutor) driver;

	}

	@And("navigate to the url")
	public void navigate_to_the_url() {
	    // Write code here that turns the phrase above into concrete actions
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		JavascriptExecutor js =  (JavascriptExecutor)driver;
	}

	@When("Do mouse hover actions")
	public void do_mouse_hover_actions() {
	    // Write code here that turns the phrase above into concrete actions
		WebElement mensfashion = driver.findElement(By.xpath("//*[@id=\"leftNavMenuRevamp\"]/div[1]/div[2]/ul/li[1]"));
		Actions act = new Actions(driver);
		act.moveToElement(mensfashion).build().perform();
		driver.findElement(By.linkText("Sunglasses")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Step 1: Wait until the element is present in the DOM (even if it's not visible)
        WebElement sunglassfind = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"668637584109\"]/div[2]/div[1]/a")));

        // Step 2: Scroll the element into view using JavaScript
        js.executeScript("arguments[0].scrollIntoView(false);", sunglassfind);
       // Thread.sleep(3000);
        String mainwindowhandle = driver.getWindowHandle();
        
        sunglassfind.click();
        
        Set<String> allwindowhandles  = driver.getWindowHandles();
        for(String handle : allwindowhandles) {
        	if(!handle.equals(mainwindowhandle)) {
        		driver.switchTo().window(handle);
        		break;
        	}
        }
	}

	@And("Add item to the cart")
	public void add_item_to_the_cart() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		// Write code here that turns the phrase above into concrete actions
		WebElement addtocart  = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"add-cart-button-id\"]")));

        // Step 2: Scroll the element into view using JavaScript
        js.executeScript("arguments[0].scrollIntoView(false);", addtocart);
       // Thread.sleep(3000);

        
        addtocart.click();
       // Thread.sleep(3000);
       // Thread.sleep(3000)
	}

	@Then("verify the item in the cart")
	public void verify_the_item_in_the_cart() {
	    // Write code here that turns the phrase above into concrete actions
		WebElement viewcart =driver.findElement(By.xpath("//*[@id=\"cartProductContainer\"]/div/div[2]/div[2]/div/div[2]/div"));
		viewcart.click();
		
	       // Thread.sleep(3000);
	        
	        //WebElement drop = driver.findElement(By.id("CS1"));
	        //drop.click();
	        WebElement option = driver.findElement(By.xpath("/html/body/div[16]/ul/li[1]")); // Adjust the XPath as needed
	        String optionText = option.getText();
	        System.out.println("Option Text: " + optionText);
	        if(optionText.equals("1")) {
	        	WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
	            WebElement pin = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"pincode-value\"]")));

	            // Clear any pre-existing text and enter the pincode
	            pin.clear();
	            pin.sendKeys("500096");

	            // Locate and click the "check" button
	            WebElement check = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"send-pincode\"]")));
	            check.click();
	            
	            WebElement available = driver.findElement(By.linkText("Showing Availability at"));
	            if(available.isDisplayed()) {
	            	System.out.println("Availability is Fetched and Successful");
	            }
	        }
	}

	@And("close the browser")
	public void close_the_browser() {
	    // Write code here that turns the phrase above into concrete actions

	}




}
