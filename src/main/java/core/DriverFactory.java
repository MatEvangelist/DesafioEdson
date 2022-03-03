package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

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
        if (driver == null) driver = new ChromeDriver();
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
