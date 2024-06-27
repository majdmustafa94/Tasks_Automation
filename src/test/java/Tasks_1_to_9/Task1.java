package Tasks_1_to_9;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Task1 {

    public WebDriver driver;

    @BeforeTest
    public void open_Website() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://www.google.com/ncr");
    }

    @Test()
    public void Task_1() {
        String Check_title = driver.getTitle();
        String Expected_Title = "Google";

        Assert.assertEquals(Check_title, Expected_Title);
    }

    @AfterTest
    public void close_Browser() {
        driver.quit();
    }
}
