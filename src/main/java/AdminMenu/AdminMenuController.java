package AdminMenu;

import Data.User;
import Utils.*;
public class AdminMenuController {
    private final AdminMenuView view;
    private final AdminMenuModel model;
    UserInput input = new UserInput();
    UserReader reader = new UserReader();

    public AdminMenuController(AdminMenuModel model, AdminMenuView view) {
        this.model = model;
        this.view = view;
    }

    public void requestUserInput() {
        LoginHandler handler = new LoginHandler();
        User user = handler.login();
        model.handleOption(user);
    }
}
