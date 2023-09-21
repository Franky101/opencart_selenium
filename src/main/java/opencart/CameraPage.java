package opencart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CameraPage extends Page{

    public CameraPage(WebDriver driver) {
        super(driver);
    }
    // Locators

    private By alertSuccess = By.className("alert-success");
    private By wishListBtn = By.id("wishlist-total");

    private By addToCartBtn = By.xpath("//*[@id=\"content\"]/div[2]/div[1]/div/div[2]/div[2]/button[1]/span");

    // First Product Locators
//    private WebElement firstProductName = driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[1]/div/div[2]/div[1]/h4/a"));
//    public WebElement getFirstProductNameElement() {
//        return driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[1]/div/div[2]/div[1]/h4/a"));
//    }
    private By firstFavoriteBtn = By.xpath("//*[@id=\"content\"]/div[2]/div[1]/div/div[2]/div[2]/button[2]");

    // Methods
//    public String getFirstProductName() {
//        return getFirstProductNameElement().getText();
//    }
    public void addFirstFavorite() {
        click(firstFavoriteBtn);
    }
//    public String getFirstProductName() {
//        return firstProductName.getText();
//    }

    public void openWishList(){
        click(wishListBtn);
    }
    public boolean alertSucessVisible() {
        return isDisplayed(alertSuccess);
    }

    public void addFirstProduct() {
        click(addToCartBtn);
    }
}
