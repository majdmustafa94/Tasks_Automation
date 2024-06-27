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

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task7 {

    public WebDriver driver;

    @BeforeTest
    public void open_website() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://www.w3schools.com/html/html_tables.asp");
    }

    @Test()
    public void Task_7() {

        Map<String, String> hashMap = new HashMap<>();
        String Company;
        String Country;

        List<WebElement> table = driver.findElements(By.xpath("//*[@id=\"customers\"]/tbody/tr"));
        for (int i = 2; i < table.size(); i++) {
            Company = driver.findElement(By.xpath("//*[@id=\"customers\"]/tbody/tr[" + i + "]/td[1]")).getText();
            Country = driver.findElement(By.xpath("//*[@id=\"customers\"]/tbody/tr[" + i + "]/td[3]")).getText();
            hashMap.put(Company, Country);
        }
        Assert.assertEquals(hashMap.get("Ernst Handel"), "Austria");
    }

    @AfterTest
    public void close_Browser() {
        driver.quit();
    }
}
