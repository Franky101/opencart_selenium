package opencart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ConfirmCreationPage {

    // Attributes
    private WebDriver driver;
    private WebDriverWait wait;

    // Constructor
    public ConfirmCreationPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    // Locators
    // Text from confirmation
    private By congratText = By.xpath("//*[contains(text(),'Congratulations! Your new account has been successfully created!')]");
    // Continue Button
    private By continueBtn = By.xpath("//a[text()='Continue']");

    // Methods

    public boolean confirmAccount() {
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(congratText));
        return element.isDisplayed();
    }
    public void continueBtnClick() {
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(continueBtn));
        element.click();
//        driver.findElement(continueBtn).click();
    }
}
