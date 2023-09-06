package pagesandstuff;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RegisterPage {

    // Locators

    // H1 header "Account"
    private By accountHeader = By.xpath("//h1[text()='Account']");

    // First name
    private By firstNameField = By.id("input-firstname");
    // Last Name
    private By lastNameField = By.id("input-lastname");
    // Email
    private By emailField = By.id("input-email");
    // Telephone
    private By telephoneField = By.id("input-telephone");
    // Password
    private By pswdField = By.id("input-password");
    // Password Confirm
    private By pswdConfirmField = By.id("input-confirm");
    // Newsletter
    private By newsletterCheck = By.xpath("//*[@id=\"content\"]/form/fieldset[3]/div/div/label[2]/input");
    // Agreement check
    private By agreeCheck = By.xpath("//input[@type='checkbox']");
    // Submit Button
    private By submitBtn = By.xpath("//*[@type='submit']");



    // Account Control Panel Elements: #Note: This should go to a different test and page
    private By myAccountHeader = By.xpath("//h2[text()='My Account']");
    private By myOrdersHeader = By.xpath("//h2[text()='My Orders']");
    private By myAffiliate = By.xpath("//h2[text()='My Affiliate Account']");
    private By myNewsletterHeader = By.xpath("//h2[text()='Newsletter']");



    // Attributes
    private WebDriver driver;
    private WebDriverWait wait;

    // Constructor
    public RegisterPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    // Methods
    public boolean headerElementVisible() {
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(accountHeader));
        return element.isDisplayed();
    }

    public void fillRegisterForm(String firstName,
                                 String lastName,
                                 String email,
                                 String phone,
                                 String pass) {
        driver.findElement(firstNameField).sendKeys(firstName);
        driver.findElement(lastNameField).sendKeys(lastName);
        driver.findElement(emailField).sendKeys(email);
        driver.findElement(telephoneField).sendKeys(phone);
        driver.findElement(pswdField).sendKeys(pass);
        driver.findElement(pswdConfirmField).sendKeys(pass);
    }
    public void firstNameInput(String firstName) {
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(firstNameField));
        element.sendKeys(firstName);
    }
    public void lastNameInput(String lastName) {
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(lastNameField));
        element.sendKeys(lastName);
    }
    public void emailInput(String email) {
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(emailField));
        element.sendKeys(email);
    }
    public void telephoneInput(String telephoneNumber) {
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(telephoneField));
        element.sendKeys(telephoneNumber);
    }
    public void paswdInput(String password) {
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(pswdField));
        element.sendKeys(password);
    }
    public void paswdConfirmInput(String password) {
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(pswdConfirmField));
        element.sendKeys(password);
    }
    public void newsLetterClick() {
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(newsletterCheck));
        element.click();
    }

    public void agreeCheckClick() {
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(agreeCheck));
        element.click();
    }
    public void SubmitBtnClick() {
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(submitBtn));
        element.click();
    }
}


