package Tasks_1_to_9;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class Task4 {

    public WebDriver driver;

    @BeforeTest
    public void open_Website() {

        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().window().maximize();
        driver.get("https://www.google.com/ncr");
    }

    @Test()
    public void Task_4() {
        driver.findElement(By.xpath("//*[@class=\"gLFyf\"]")).sendKeys("TestNG" + Keys.ENTER);

        String Actual_result = driver.findElements(By.cssSelector("#rso h3")).get(3).getText();
        String Expected_result = "TestNG Tutorial/TestNG Listeners";

        Assert.assertEquals(Expected_result.contains(Actual_result), true);
    }

    @AfterTest
    public void close_Browser() {
        driver.quit();
    }
}
