package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {
    private static WebDriver driver;

    public static WebDriver getDriver() {
        if(driver == null) {
            switch(Properties.BROWSER) {
                case CHROME:
                    System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
                    driver = new ChromeDriver();
                    break;
                case FIREFOX:
                    System.setProperty("webdriver.gecko.driver", "src/test/resources/drivers/geckodriver.exe");
                    driver = new FirefoxDriver();
                    break;
            }
        }
        return driver;
    }

    public static void stopDriver() {
        if(driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
