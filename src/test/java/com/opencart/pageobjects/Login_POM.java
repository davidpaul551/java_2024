package com.opencart.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_POM {

    // WebDriver instance to interact with the browser
    WebDriver driver;

    // Using PageFactory annotations to find elements
    @FindBy(id = "input-email")  // Find the username field by its id
    WebElement username;

    @FindBy(id = "input-password")  // Find the password field by its id
    WebElement password;

    @FindBy(xpath = "//*[@id=\"form-login\"]/div[3]/button")  // Find the login button by its xpath
    WebElement loginButton;

    // Constructor to initialize the PageFactory elements
    public Login_POM(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);  // Initialize the elements with the driver
    }

    // Method to enter username/email into the username field
    public void enterUserName(String email) {
        username.sendKeys(email);  // Enter email into the username field
    }

    // Method to enter password into the password field
    public void enterPassword(String pass) {
        password.sendKeys(pass);  // Enter password into the password field
    }

    // Method to click the login button to submit the form
    public void clickloginbutton() {
        loginButton.click();  // Click the login button
    }

	
}