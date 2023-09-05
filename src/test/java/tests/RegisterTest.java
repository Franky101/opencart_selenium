package tests;

import baseFiles.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pagesandstuff.MainPage;
import pagesandstuff.RegisterPage;

public class RegisterTest extends BaseTest {

    @Test
    public void openRegisterPage(){
        MainPage mainPage = new MainPage(getDriver());
        RegisterPage registerPage = new RegisterPage(getDriver());

        mainPage.openRegister();
        registerPage.headerElementVisible();
    }

    @Test(dependsOnMethods = "openRegisterPage")
    public void fillRegisterPage() {

        String baseEmail = "UserTest";
        String email = baseEmail + System.currentTimeMillis() + "@gmail.com";

        RegisterPage registerPage = new RegisterPage(getDriver());
        registerPage.firstNameInput("Franco");
        registerPage.lastNameInput("Becerra");
        registerPage.emailInput(email);
        registerPage.telephoneInput("+54 9 351-48655153");
        registerPage.paswdInput("123456789");
        registerPage.paswdConfirmInput("123456789");
        registerPage.newsLetterClick();
        registerPage.agreeCheckClick();
        registerPage.SubmitBtnClick();
    }
    @Test(dependsOnMethods = "fillRegisterPage")
    public void confirmAccountCreation() {
        RegisterPage registerPage = new RegisterPage(getDriver());
        Assert.assertTrue(registerPage.confirmAccount());
//        registerPage.continueBtnClick();
    }


    // Account Control Panel test from here forward.
    @Test(dependsOnMethods = "confirmAccountCreation")
    public void accountControlPanel(){
        RegisterPage registerPage = new RegisterPage(getDriver());

    }

}
