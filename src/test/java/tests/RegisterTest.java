package tests;

import baseFiles.BaseTest;
import org.testng.annotations.Test;
import pagesandstuff.MainPage;
import pagesandstuff.RegisterPage;

public class RegisterTest extends BaseTest {

    @Test
    public void registerCorrect(){
        MainPage mainPage = new MainPage(getDriver());
        RegisterPage registerPage = new RegisterPage(getDriver());
        mainPage.openRegister();

        registerPage.

    }


//    RegisterPage registerPage = new RegisterPage(getDriver());
//        homePage.accederAlLogin();
}
