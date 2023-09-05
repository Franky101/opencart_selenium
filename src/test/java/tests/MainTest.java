package tests;

import baseFiles.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pagesandstuff.MainPage;

public class MainTest extends BaseTest {
    @Test
    public void HomeValidation() {
        MainPage mainPage = new MainPage(getDriver());
        Assert.assertTrue(mainPage.MyAccountVisible());
    }
}
