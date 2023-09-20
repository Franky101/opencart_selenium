package tests.stepDefinitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import opencart.*;
import org.testng.Assert;
import tests.RegisterTest;
import tests.hooks.Hooks;

public class LoginDefinitions {

    private MainPage mainPage;
    private LoginPage loginPage;
    private AccountPage accountPage;
    public LoginDefinitions() {
        this.mainPage = new MainPage(Hooks.getDriver());
        this.loginPage = new LoginPage(Hooks.getDriver());
        this.accountPage = new AccountPage(Hooks.getDriver());
    }
    @Dado("que el usuario accede a la pagina de login")
    public void queElUsuarioAccedeALaPaginaDeLogin() {
        mainPage.openUrl("https://opencart.abstracta.us/");
        mainPage.openLogin();
    }
    @Cuando("el usuario ingresa email y contraseña validas")
    public void elUsuarioIngresaEmailYContrasenaValidas() {
        loginPage.login("becerrafranco1992@gmail.com","123456789");
    }
    @Entonces("el usuario se encuentra en la pantalla de su cuenta")
    public void elUsuarioSeEncuentraEnLaPantallaDeSuCuenta() {
        Assert.assertTrue(accountPage.titleVisible());
    }
}
