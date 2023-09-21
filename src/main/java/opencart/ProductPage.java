package opencart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class ProductPage extends Page {
    public ProductPage(WebDriver driver) {
        super(driver);
    }

    //Locators

    private By colorDropDown = By.id("input-option226");
    private By firstOption = By.xpath("//*[@id=\"input-option226\"]/option[2]");
    private By addToCardBtn = By.xpath("//button[text()='Add to Cart']");
    private By sucessAlert = By.xpath("//*[contains(text(),\"Success: You have added \")]");
    private By shopCartLink = By.xpath("//a[contains(text(),\"shopping cart\")]");
    public boolean successAlertVisible() {
        return isDisplayed(sucessAlert);
    }
    public void productDetails() {
        click(colorDropDown);
        click(firstOption);
        click(addToCardBtn);
    }
    public void openShoppingCart() {
        click(shopCartLink);
    }







}
