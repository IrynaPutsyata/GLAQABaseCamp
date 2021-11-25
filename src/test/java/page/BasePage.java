package page;

import driver.Driver;
import org.openqa.selenium.WebDriver;

public class BasePage {
    protected final WebDriver driver;


    public BasePage(){
        driver = Driver.DRIVERS.get();
    }

    public void navigateToUrl(String url) {
        driver.get(url);
        driver.manage().window().maximize();
    }
}
