package Tasks_1_to_9;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class Task5 {

    public WebDriver driver;

    @BeforeTest
    public void open_Website() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().window().maximize();
        driver.get("https://www.google.com/ncr");
    }

    @Test()
    public void Task_5() {
        driver.findElement(By.xpath("//*[@class=\"gLFyf\"]")).sendKeys("Cucumber IO" + Keys.ENTER);

        String Actual_result = driver.findElements(By.cssSelector("#rso cite")).get(0).getText();
        String Expected_result = "https://cucumber.io";

        Assert.assertEquals(Expected_result.contains(Actual_result), true);
    }

    @AfterTest
    public void close_Browser() {
        driver.quit();
    }
}
