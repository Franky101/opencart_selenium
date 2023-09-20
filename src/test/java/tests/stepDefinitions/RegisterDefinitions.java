package tests.stepDefinitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import opencart.*;
import org.testng.Assert;
import tests.hooks.Hooks;

import static tests.hooks.Hooks.getDriver;

public class RegisterDefinitions {

    private MainPage mainPage;
    private RegisterPage registerPage;
    private ConfirmCreationPage confirmCreationPage;

    public RegisterDefinitions() {
        this.mainPage = new MainPage(getDriver());
        this.registerPage = new RegisterPage(getDriver());
        this.confirmCreationPage = new ConfirmCreationPage(getDriver());
    }

    @Dado("que el usuario accede a la pagina de registro")
    public void queElUsuarioAccedeALaPaginaDeRegistro() {
        mainPage.openUrl("https://opencart.abstracta.us/");
        mainPage.openRegister();
    }
    @Cuando("el usuario llena el formulario con informacion valida y hace click en submit")
    public void elUsuarioLlenaElFormularioConInformacionValidaYHaceClickEnSubmit() {
        String baseEmail = "UserTest";
        String email = baseEmail + System.currentTimeMillis() + "@gmail.com";
        RegisterPage registerPage = new RegisterPage(getDriver());

        registerPage.fillRegisterForm(
                "Test",
                "User",
                email,
                "111-1111",
                "123456789"
        );
        registerPage.newsLetterClick();
        registerPage.agreeCheckClick();
        registerPage.SubmitBtnClick();
    }
    @Entonces("el usuario se encuentra en la pantalla de confirmacion")
    public void elUsuarioSeEncuentraEnLaPantallaDeConfirmacion() {
        Assert.assertTrue(confirmCreationPage.confirmAccount());
    }
}
