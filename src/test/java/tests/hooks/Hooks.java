package tests.hooks;

import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Hooks {
    private static WebDriver driver;
    private static Properties properties;

    @Before
    public void setUp(Scenario scenario) throws IOException {

        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--incognito");

        // Create driver
        driver = new ChromeDriver(options);

        // Open a webpage
        driver.get("https://opencart.abstracta.us/");

        properties = new Properties();
        properties.load(
                new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\config.properties")
        );


    }


    public WebDriver getDriver() {
    }
    public
}
