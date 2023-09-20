package opencart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AccountPage extends Page{
    public AccountPage(WebDriver driver) {
        super(driver);
    }
    // Locators
    private By accountTitle = By.xpath("//h2[contains(text(),'My Account')]");
    // Locator for Practico 10 | ICARO
    private By cameraBtn = By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[7]/a");
    public boolean titleVisible() {
        return isDisplayed(accountTitle);
    }

    public void openCamera() {
        click(cameraBtn);
    }

}
