import driver.Driver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import service.ApiService;
import util.SystemProperties;

public class BaseTest {

    static ApiService apiService = new ApiService(SystemProperties.APPLICATION_URL);  // Для взаємодії з API

    @BeforeSuite
    public void setup() {
        Driver.downLoadWebDriver();
    }

    @BeforeClass
    public void createDriver() {
        Driver.instanceWebBrowser();
    }

    @AfterSuite
    public void closeBrowser() {
        Driver.closeBrowser();
    }

}
