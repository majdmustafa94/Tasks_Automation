package Tasks_1_to_9;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Task6 {

    public WebDriver driver;

    @BeforeTest
    public void open_Website() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("http://the-internet.herokuapp.com/checkboxes");
    }

    @Test()
    public void Task_6() {
        driver.findElement(By.xpath("//*[@type=\"checkbox\"]")).click();
        Boolean check = driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[1]")).isSelected();

        Assert.assertEquals(check, true);
    }

    @AfterTest
    public void close_Browser() {
        driver.quit();
    }
}
