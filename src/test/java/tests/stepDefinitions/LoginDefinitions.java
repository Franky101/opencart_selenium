package tests.stepDefinitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import opencart.ConfirmCreationPage;
import opencart.MainPage;
import opencart.RegisterPage;
import org.testng.Assert;
import tests.RegisterTest;
import tests.hooks.Hooks;

public class LoginDefinitions {

    private MainPage mainPage;
    private RegisterPage registerPage;
    private ConfirmCreationPage confirmCreationPage;
//    private MyAccountPage myAccountPage;

    public LoginDefinitions() {
        this.mainPage = new MainPage(Hooks.getDriver());
        this.registerPage =  new RegisterPage(Hooks.getDriver());
//        this.myAccountPage = new MyAccountPage(Hooks.getDriver());
    }

    @Dado("que el usuario accede a la pagina de login")
    public void queElUsuarioAccedeALaPaginaDeLogin() {
        System.out.println("step DADO");
        mainPage.openPage("https://opencart.abstracta.us/");
        // Tendria que abrir el Login, no el register <<<
        mainPage.openRegister();
    }
    @Cuando("el usuario ingresa email y contraseña validas")
    public void elUsuarioIngresaEmailYContrasenaValidas() {
        System.out.println("Step CUANDO");
//        registerPage.accessAllLogin("becerrafranco1992@gmail.com","123456789");
    }

    @Entonces("el usuario se encuentra en la pantalla de su cuenta")
    public void elUsuarioSeEncuentraEnLaPantallaDeSuCuenta() {
        System.out.println("Step ENTONCES");

    }
}
