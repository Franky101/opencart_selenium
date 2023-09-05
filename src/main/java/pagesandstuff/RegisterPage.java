package pagesandstuff;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RegisterPage {

    // Locators

    // First name
    // Last Name
    // Email
    // Telephone
    // Password
    // Password Confirm
    // Nesletter
    // Agreement check
    // Submit Button



    // Attributes
    private WebDriver driver;
    private WebDriverWait wait;

    // Constructor
    public RegisterPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

}


