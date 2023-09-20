package opencart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WishListPage extends Page {

    public WishListPage(WebDriver driver) {
        super(driver);
        CameraPage cameraPage = new CameraPage(driver);
    }


    // Locators
    private By wishListTitle = By.xpath("//a[contains(text(),'My Wish List')]");

//    private By favoriteProduct = By.xpath("//a[contains(text(),'" + cameraPage.getFirstProductName() + "')]");
    private By favoriteProduct = By.xpath("//a[contains(text(),'Canon EOS 5D')]");

//    public By FavoriteProductLocator() {
//        return By.xpath("//a[contains(text(),'" + cameraPage.getFirstProductName() + "')]");
//    }
//    public By FavoriteProductLocator() {
//        return By.xpath("//a[contains(text(),'Canon EOS 5D')]");
//    }

    // Methods
    public boolean titleVisible() {
        return isDisplayed(wishListTitle);
    }
    public boolean favoriteProductVisible() {
        return isDisplayed(favoriteProduct);
    }

//    public boolean FavoriteProductVisible() {
//        return isDisplayed(favoriteProduct);
//    }



}
