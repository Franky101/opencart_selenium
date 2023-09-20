package tests.stepDefinitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import opencart.*;
import org.testng.Assert;
import tests.hooks.Hooks;

public class FavoriteDefinitions {
    private CameraPage cameraPage;
    private MainPage mainPage;
    private LoginPage loginPage;
    private AccountPage accountPage;
    private WishListPage wishListPage;
    public FavoriteDefinitions() {
        this.mainPage = new MainPage(Hooks.getDriver());
        this.loginPage = new LoginPage(Hooks.getDriver());
        this.accountPage = new AccountPage(Hooks.getDriver());
        this.cameraPage = new CameraPage(Hooks.getDriver());
        this.wishListPage = new WishListPage(Hooks.getDriver());
    }
    @Dado("que el usuario acceda a su cuenta")
    public void queElUsuarioAccedeALaPaginaDeLogin() {
        mainPage.openUrl("https://opencart.abstracta.us/");
        mainPage.openLogin();
    }
    @Y("el usuario ingresa su email y contraseña")
    public void elUsuarioIngresaEmailYContrasenaValidas() {
        loginPage.login("becerrafranco1992@gmail.com","123456789");
    }
    @Cuando("el usuario ingresa a la seccion cameras")
    public void elUsuarioIngresaALaSeccionCameras() {
        accountPage.openCamera();
    }
    @Y("agregar producto a favoritos con el corazon")
    public void agregarProductoAFavoritosConElCorazon() {
        cameraPage.addFirstFavorite();
        Assert.assertTrue(cameraPage.alertSucessVisible());
    }
    @Entonces("el usuario visualiza nuevo item en su wishlist")
    public void elUsuarioVisualizaNuevoItemEnSuWishlist() {
        cameraPage.openWishList();
        Assert.assertTrue(wishListPage.favoriteProductVisible());
    }
}
