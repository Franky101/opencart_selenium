package pagesandstuff;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MainPage {

    // Locators

    private By myAccountBtn = By.xpath("//a[@title='My Account']");
    private By dropDownOption = By.xpath("//li/a[text()='Register'][1]");

    // Atributos
    private WebDriver driver;
    private WebDriverWait wait;

    // Constructor
    public MainPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    // Methods
    public boolean MyAccountVisible()  {
        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(myAccountBtn));
        return element.isDisplayed();
    }

    public void openRegister() {
        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(myAccountBtn));
        element.click();
        WebElement element2 = wait.until(ExpectedConditions.elementToBeClickable(dropDownOption));
        element2.click();
    }
}
