package tests;

import baseFiles.BaseTest;
import opencart.AccountPage;
import opencart.LoginPage;
import opencart.MainPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import static java.sql.DriverManager.getDriver;

public class LoginTest extends BaseTest {

    @Test
    public void loginCorrecto() {
        MainPage mainPage = new MainPage((WebDriver) getDriver());
        LoginPage loginPage = new LoginPage(getDriver());
        AccountPage myAccountPage = new AccountPage(getDriver());

        // Steps in mainPage
        mainPage.openLogin();

        // Steps in loginPage
        loginPage.login("becerrafranco1992@gmail.com","123456789");

        // Asserts
        Assert.assertTrue(myAccountPage.titleVisible());
    }

    @Test
    public void loginIncorrecto() {
        MainPage mainPage = new MainPage((WebDriver) getDriver());
        LoginPage loginPage = new LoginPage(getDriver());
        AccountPage myAccountPage = new AccountPage(getDriver());

        // Steps in mainPage
        mainPage.openLogin();

        // Steps in loginPage
        loginPage.login("aLaGrandeLePuseCuca@gmail.com","Simpsons");

        // Asserts
        Assert.assertTrue(loginPage.alertVisible());
    }

}
