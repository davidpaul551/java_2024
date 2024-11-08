package Selenium_LabBook.Page_Object_Model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_PageFactory {
    WebDriver driver;

    @FindBy(id = "input-email")
    WebElement username;

    @FindBy(id = "input-password")
    WebElement password;

    @FindBy(xpath = "//*[@id=\"form-login\"]/div[3]/button")
    WebElement loginButton;

    // Constructor to initialize PageFactory elements
    public Login_PageFactory(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void enterUserName(String email) {
        username.sendKeys(email);
    }

    public void enterPassword(String pass) {
        password.sendKeys(pass);
    }

    public void clickloginbutton() {
        loginButton.click();
    }
}
