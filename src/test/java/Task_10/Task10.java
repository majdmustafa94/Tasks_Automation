package Task_10;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class Task10 extends Param_10 {

    @Test()
    public void Test_1() {
        driver.get(google_URL);
        String Check_title = driver.getTitle();
        Assert.assertEquals(Check_title, Expected_Title);
    }

    @Test()
    public void Test_2() {
        driver.get(google_URL);
        Boolean Check_is_displayed = driver.findElement(By.xpath("//*[@class=\"lnXdpd\"]")).isDisplayed();
        Assert.assertEquals(Check_is_displayed, true);
    }

    @Test()
    public void Test_3() {
        driver.get(google_URL);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.findElement(By.xpath("//*[@class=\"gLFyf\"]")).sendKeys("Selenium WebDriver" + Keys.ENTER);
        String Actual_result = driver.findElements(By.cssSelector("#rso h3")).get(0).getText();
        Assert.assertEquals(Expected_result.contains(Actual_result), true);
    }

    @Test()
    public void Test_4() {
        driver.get(google_URL);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.findElement(By.xpath("//*[@class=\"gLFyf\"]")).sendKeys("TestNG" + Keys.ENTER);
        String Actual_result = driver.findElements(By.cssSelector("#rso h3")).get(3).getText();
        Assert.assertEquals(Expected_result4.contains(Actual_result), true);
    }

    @Test()
    public void Test_5() {
        driver.get(google_URL);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.findElement(By.xpath("//*[@class=\"gLFyf\"]")).sendKeys("Cucumber IO" + Keys.ENTER);
        String Actual_result = driver.findElements(By.cssSelector("#rso cite")).get(0).getText();
        Assert.assertEquals(Expected_result5.contains(Actual_result), true);
    }

    @Test()
    public void Test_6() {
        driver.get(checkboxes_URL);
        driver.findElement(By.xpath("//*[@type=\"checkbox\"]")).click();
        Boolean check = driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[1]")).isSelected();
        Assert.assertEquals(check, true);
    }

    @Test()
    public void Test_7() {
        driver.get(w3schools_URL);
        String Country = driver.findElement(By.xpath("//*[@id=\"customers\"]//tr[4]/td[3]")).getText();
        Assert.assertEquals(Country, "Austria");
    }

    @Test()
    public void Test_8() {
        driver.get(upload_URL);
        WebElement image = driver.findElement(By.xpath("//*[@id=\"file-upload\"]"));
        image.sendKeys("C:\\Users\\Majd Mustafa\\IdeaProjects\\Tasks\\src\\test\\resources\\download.jpg");
        driver.findElement(By.xpath("//*[@id=\"file-submit\"]")).click();
        Boolean check = driver.findElement(By.cssSelector("#content h3")).isDisplayed();
        Assert.assertEquals(check, true);
    }

    @Test()
    public void Test_9() {
        driver.get(droppable_URL);
        Actions action = new Actions(driver);
        action.clickAndHold(driver.findElement(By.xpath("//*[@id=\"draggable\"]"))).moveToElement(driver.findElement(By.xpath("//*[@id=\"droppable\"]"))).release().build().perform();
        String text = driver.findElement(By.xpath("//*[@id=\"droppable\"]")).getText();
        Assert.assertEquals(text, "Dropped!");
    }
}
