package core.configWeb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.HashMap;
import java.util.Map;

public class DriverFactory {

    protected static WebDriver driver;
    protected static WebDriverWait wait;

    public static WebDriver getDriver() {
        if (driver == null) {
            createDriver();
        }
        return driver;
    }

    public static void createDriver() {
        Map<String, Object> prefs = new HashMap<>();
        prefs.put("profile.default_content_setting_values.notifications", 2);
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.setExperimentalOption("prefs", prefs);
        if (driver == null) driver = new ChromeDriver(options);
        wait = new WebDriverWait(driver, 40);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("http://advantageonlineshopping.com/#/");
    }

    public static WebDriverWait getWait() {
        return wait;
    }

    public static void killDriver() {
        if (driver != null) {
            driver.close();
            driver.quit();
            driver = null;
        }
    }

}
