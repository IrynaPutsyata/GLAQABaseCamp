package driver;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DriverUtils {
    private WebDriver driver;

    public DriverUtils() {
        driver = Driver.DRIVERS.get();
    }

    // описуємо певні кроки, які будемо робити на сорінці
    public void clickOnElements (WebElement webElement){// клікаємо на веб елементи(кнопки,поля)
        getJSExecutor().executeScript("arguments[0].click();", webElement);
    }

    private JavascriptExecutor getJSExecutor() { //достукоємось до драйверу щоб клікати на сторінки
        return (JavascriptExecutor) driver;
    }

}
