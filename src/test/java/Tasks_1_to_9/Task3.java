package Tasks_1_to_9;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Task3 {

    public WebDriver driver;

    @BeforeTest
    public void open_Website (){

        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://www.google.com/ncr");
    }

    @Test()
    public void Task_3(){

        driver.findElement(By.xpath("//*[@class=\"gLFyf\"]")).sendKeys("Selenium WebDriver"+ Keys.ENTER);

        String Actual_result= driver.findElements(By.cssSelector("#rso h3")).get(0).getText();
        String Expected_result="Selenium - Web Browser Automation / Selenium WebDriver";

        Assert.assertEquals(Expected_result.contains(Actual_result), true);
    }

    @AfterTest
    public void close_Browser(){
        driver.quit();
    }
}
