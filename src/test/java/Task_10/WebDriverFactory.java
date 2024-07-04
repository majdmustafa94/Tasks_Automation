package Task_10;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverFactory {
    public static WebDriver createDriver(String browserType) {
        switch (browserType.toLowerCase()) {
            case "chrome":
                return new ChromeDriver();
            case "firefox":
                return new FirefoxDriver();
            // Add other cases for different browsers
            default:
                throw new IllegalArgumentException("Unsupported browser type: " + browserType);
        }
    }
}