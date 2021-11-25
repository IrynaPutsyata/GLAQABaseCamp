package driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {
    public static final ThreadLocal<WebDriver> DRIVERS = new ThreadLocal<>();
    public static WebDriver webDriver;

    public Driver() {
    }

    public static void downLoadWebDriver() {
        WebDriverManager.chromedriver().setup(); // налаштовується драйвер за допомогою менеджера
    }
    // додаємо методи щоб відкривались і закривались нові вікна
    public static void instanceWebBrowser() {
        webDriver = new ChromeDriver();
        DRIVERS.set(webDriver);
    }

    public static void closeBrowser() {
        webDriver.quit();
    }
}
