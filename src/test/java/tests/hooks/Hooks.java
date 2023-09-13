package tests.hooks;

import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;

public class Hooks {
    private static WebDriver driver;

    @Before
    public void setup() {

        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--incognito");

        // Create driver
        driver = new ChromeDriver(options);

        // Open a webpage
        driver.get("https://opencart.abstracta.us/");

    }


    public WebDriver getDriver() {
    }
}
