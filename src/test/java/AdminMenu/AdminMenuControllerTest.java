package AdminMenu;

import java.util.ArrayList;

import org.junit.jupiter.api.Disabled;

import org.junit.jupiter.api.Test;

class AdminMenuControllerTest {

    @Test
    void testConstructor() {

        AdminMenuModel model = new AdminMenuModel();
        new AdminMenuController(model, new AdminMenuView(new ArrayList<>()));

    }

}

