package Tasks_1_to_9;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Duration;

public class Task8 {

    public WebDriver driver;

    @BeforeTest
    public void open_website() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("http://the-internet.herokuapp.com/upload");
    }

    @Test()
    public void Task_8() {
        WebElement image = driver.findElement(By.xpath("//*[@id=\"file-upload\"]"));
        image.sendKeys("C:\\Users\\Majd Mustafa\\IdeaProjects\\Tasks\\src\\test\\resources\\download.jpg");

        driver.findElement(By.xpath("//*[@id=\"file-submit\"]")).click();

        Boolean check = driver.findElement(By.cssSelector("#content h3")).isDisplayed();

        Assert.assertEquals(check, true);
    }

    @AfterTest
    public void close_Browser() {
        driver.quit();
    }
}
