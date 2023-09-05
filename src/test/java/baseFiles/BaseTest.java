package baseFiles;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {
    public WebDriver driver;
    public WebDriverWait wait;
    @BeforeTest
    public void setup() {

        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--incognito");

        // Create driver
        this.driver = new ChromeDriver(options);

        // Open a webpage
        driver.get("https://opencart.abstracta.us/");

    }
    public WebDriver getDriver() {
        return driver;
    }
    public WebDriverWait getWait() { return wait; }
    @AfterTest
    public void tearDown() {
        if (this.driver != null) {
            this.driver.close();
        }
    }
}
