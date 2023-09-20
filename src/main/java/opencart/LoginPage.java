package opencart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LoginPage extends Page {
    // Locators

    private By emailField = By.id("input-email");
    private By pswdField = By.id("input-password");
    private By loginBtn = By.xpath("//input[@value='Login']");

    private By loginAlert = By.className("alert-danger");

    // Constructor
    public LoginPage(WebDriver driver) {
        super(driver);
    }
    public void login(String email, String pass) {
        driver.findElement(emailField).sendKeys(email);
        driver.findElement(pswdField).sendKeys(pass);
        driver.findElement(loginBtn).click();
    }
    public boolean alertVisible() {
        return isDisplayed(loginAlert);
    }
}
