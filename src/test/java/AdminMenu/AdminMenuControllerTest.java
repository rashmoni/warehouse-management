package AdminMenu;

import java.util.ArrayList;

import Data.User;
import Data.UserRole;
import org.junit.jupiter.api.Disabled;

import org.junit.jupiter.api.Test;

class AdminMenuControllerTest {

    @Test
    void testConstructor() {

        User user = new User("admin1","6367c48dd193d56ea7b0baad25b19455e529f5ee","Some Name", UserRole.ADMIN);
        AdminMenuModel model = new AdminMenuModel();
        new AdminMenuController(model, new AdminMenuView(new ArrayList<>()), user);

    }

}

