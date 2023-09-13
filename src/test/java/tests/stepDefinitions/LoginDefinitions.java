package tests.stepDefinitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import opencart.MainPage;
import tests.hooks.Hooks;

public class LoginDefinitions {

    private MainPage mainPage;
    public LoginDefinitions() {
        this.mainPage = new MainPage(Hooks.getDriver());
    }

    @Dado("que el usuario accese a la pagina de login")
    public void queElUsuarioAcceseaLaPaginaDeLogin() {
        System.out.println("step DADO");
        mainPage.openRegister(Hooks.getDriver());
    }
    @Cuando("el usuario ingresa email y contraseña validas")
    public void elUsuarioIngresaEmailYContrasenaValidas() {
        System.out.println("Step CUANDO");


    }

    @Entonces("el usuario se encuentra en la pantalla de su cuenta")
    public void elUsuarioSeEncuentraEnLaPantallaDeSuCuenta() {
        System.out.println("Step ENTONCES");

    }
}
