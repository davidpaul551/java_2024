package Selenium_LabBook.Page_Object_Model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login_POM {
	WebDriver driver;
	By username = By.id("input-email");
	By password = By.id("input-password");
	By loginButton = By.xpath("//*[@id=\"form-login\"]/div[3]/button");
	
	
	public Login_POM(WebDriver driver) {
		this.driver =driver;
	}
		
		
	void enterUserName(String email) {
		driver.findElement(username).sendKeys(email);		
	}
	void enterPassword(String pass) {
		driver.findElement(password).sendKeys(pass);
	}
	void clickloginButton() {
		driver.findElement(loginButton).click();
	}
}

