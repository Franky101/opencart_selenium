package opencart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MainPage extends Page {

    // Locators

    private By myAccountBtn = By.xpath("//a[@title='My Account']");
    private By dropDownOption = By.xpath("//li/a[text()='Register'][1]");
    private By loginOption = By.xpath("//li/a[text()='Login']");

    // Atributos
    private WebDriver driver;
    private WebDriverWait wait;

    // Constructor
    public MainPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    // Methods
    public boolean MyAccountVisible()  {
        isDisplayed(myAccountBtn);
        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(myAccountBtn));
        return element.isDisplayed();
    }

    public void openRegister() {
        click(myAccountBtn);
        click(dropDownOption);
    }

    public void openLogin() {
        click(myAccountBtn);
        click(loginOption);
    }

    // New for class 10
    public void openPage(String url) {
    }
}
