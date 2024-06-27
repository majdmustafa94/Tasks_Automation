package Tasks_1_to_9;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Task2 {

    public WebDriver driver;

    @BeforeTest
    public void open_Website() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://www.google.com/ncr");
    }

    @Test()
    public void Task_2() {
        Boolean Check_is_displayed = driver.findElement(By.xpath("//*[@class=\"lnXdpd\"]")).isDisplayed();

        Assert.assertEquals(Check_is_displayed, true);
    }

    @AfterTest
    public void close_Browser() {
        driver.quit();
    }
}
