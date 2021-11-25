import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import model.User;
import org.junit.jupiter.api.Test;


import static model.User.getDefaultUser;


public class UserTest extends BaseTest {

    public static final String AVAILABLE_USERNAME = "username";

    @Test
    void shouldBeAbleToAddUser() {
        final User defaultUser = getDefaultUser();
        final User user = apiService.addUser(getDefaultUser());
        assert user != null;

    }


    @Test
    void shouldReturnUserByUserName() {
        final User response = apiService.getUsersByUsername(AVAILABLE_USERNAME);
        assert response != null;

    }


}

