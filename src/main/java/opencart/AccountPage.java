package opencart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountPage extends Page{
    public AccountPage(WebDriver driver) {
        super(driver);
    }
    // Locators
    private By accountTitle = By.xpath("//h2[contains(text(),'My Account')]");

    public boolean titleVisible() {
        return isDisplayed(accountTitle);
    }

}
