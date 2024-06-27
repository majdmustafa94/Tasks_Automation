package Tasks_1_to_9;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Task9 {
    public WebDriver driver;

    @BeforeTest
    public void open_website() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
    }

    @Test()
    public void Task_9() {
        Actions action = new Actions(driver);
        action.clickAndHold(driver.findElement(By.xpath("//*[@id=\"draggable\"]"))).moveToElement(driver.findElement(By.xpath("//*[@id=\"droppable\"]"))).release().build().perform();

        String text = driver.findElement(By.xpath("//*[@id=\"droppable\"]")).getText();
        Assert.assertEquals(text, "Dropped!");
    }

    @AfterTest
    public void close_Browser() {
        driver.quit();
    }
}
