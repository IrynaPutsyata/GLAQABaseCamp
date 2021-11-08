import org.junit.jupiter.api.Test;
import service.ApiService;
import util.SystemProperties;

public class BaseTest {


    ApiService apiService = new ApiService(SystemProperties.APPLICATION_URL);
}
