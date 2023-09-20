package tests;

import opencart.MainPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest {

    @Test
    public void loginCorrecto() {
        MainPage mainPage = new MainPage(getDriver());
        LoginPage loginPage = new LoginPage(getDriver());
        MyAccountPage myAccountPage = new MyAccountPage(getDriver());


        mainPage.accederLogin();
        loginPage.login("becerrafranco1992@gmail.com","123456789");

        Assert.assertTrue(myAccountPage.tituloEsVisible());
    }
}
