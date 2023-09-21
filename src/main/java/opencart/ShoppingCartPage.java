package opencart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShoppingCartPage extends Page{

    public ShoppingCartPage(WebDriver driver) {
        super(driver);
    }
    private By product = By.xpath("//*[@id=\"content\"]/form/div/table/tbody/tr/*/a[contains(text(),'Canon EOS 5D')]");
    public boolean productVisible() {
        return isDisplayed(product);
    }
}
