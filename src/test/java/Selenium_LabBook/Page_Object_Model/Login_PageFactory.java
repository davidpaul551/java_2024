package Selenium_LabBook.Page_Object_Model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login_PageFactory {
	WebDriver driver;
	//By username = By.id("input-email");
	@FindBy(id="input-email")
	WebElement username;
	
	//By password = By.id("input-password");
	@FindBy(id = "input-password")
	WebElement password;
	
	//By loginButton = By.xpath("//*[@id=\"form-login\"]/div[3]/button");
	@FindBy(xpath = "//*[@id=\"form-login\"]/div[3]/button")
	WebElement loginButton;
	
	
	
	public Login_PageFactory(WebDriver driver) {
		this.driver =driver;
	}
		
		
	void enterUserName(String email) {
		//driver.findElement(username).sendKeys(email);	
		username.sendKeys(email);
	}
	void enterPassword(String pass) {
		//driver.findElement(password).sendKeys(pass);
		password.sendKeys(pass);
	}
	void clickloginButton() {
		//driver.findElement(loginButton).click();
		loginButton.click();
	}
}

