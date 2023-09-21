package tests.stepDefinitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import io.cucumber.messages.types.Product;
import opencart.*;
import org.testng.Assert;
import tests.hooks.Hooks;

public class AddProductDefinitions {
    private ProductPage productPage;
    private CameraPage cameraPage;
    private MainPage mainPage;
    private LoginPage loginPage;
    private AccountPage accountPage;
    private ShoppingCartPage shoppingCartPage;

//    private ProductPage productPage;

    public AddProductDefinitions() {
        this.mainPage = new MainPage(Hooks.getDriver());
        this.loginPage = new LoginPage(Hooks.getDriver());
        this.accountPage = new AccountPage(Hooks.getDriver());
        this.cameraPage = new CameraPage(Hooks.getDriver());
        this.productPage = new ProductPage(Hooks.getDriver());
        this.shoppingCartPage = new ShoppingCartPage(Hooks.getDriver());
    }
    @Dado("que el usuario acceda a su cuenta y abra la seccion cameras")
    public void queElUsuarioAccedaASuCuentaYAbraLaSeccionCameras() {
        mainPage.openUrl("https://opencart.abstracta.us/");
        mainPage.openLogin();
        loginPage.login("becerrafranco1992@gmail.com","123456789");
        accountPage.openCamera();
    }
    @Cuando("el usuario selecciona el producto")
    public void elUsuarioSeleccionaElProducto() {
        cameraPage.addFirstProduct();

    }
    @Y("selecciona el carrito luego de agrega opciones")
    public void seleccionaElCarritoLuegoDeAgregaOpciones() {
        productPage.productDetails();
    }
    @Entonces("el usuario visualiza nuevo producto en su carrito")
    public void elUsuarioVisualizaNuevoProductoEnSuCarrito() {
        productPage.openShoppingCart();
        Assert.assertTrue(shoppingCartPage.productVisible());
    }
}
