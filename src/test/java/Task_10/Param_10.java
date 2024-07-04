package Task_10;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class Param_10 {

    WebDriver driver;
    WebDriver driver2;
    String Expected_Title = "Google";
    String Expected_result = "Selenium - Web Browser Automation / Selenium WebDriver";
    String Expected_result4 = "TestNG Tutorial/TestNG Listeners";
    String Expected_result5 = "https://cucumber.io";
    String google_URL = "https://www.google.com/ncr";
    String checkboxes_URL = "http://the-internet.herokuapp.com/checkboxes";
    String w3schools_URL = "https://www.w3schools.com/html/html_tables.asp";
    String upload_URL = "http://the-internet.herokuapp.com/upload";
    String droppable_URL = "https://jqueryui.com/resources/demos/droppable/default.html";

    @BeforeClass
    @Parameters("browser")
    public void setUp(String browser) {
        // Initialize WebDriver (e.g., ChromeDriver, FirefoxDriver)
        driver = WebDriverFactory.createDriver(browser); // Use the factory method
        driver.manage().window().maximize();
        driver.get(google_URL);
    }

    @AfterClass
    public void close_Browser() {
        driver.quit();
    }
}
