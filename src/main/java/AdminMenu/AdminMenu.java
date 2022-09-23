package AdminMenu;

import Data.User;

public class AdminMenu {
    public AdminMenu(User admin) {

        AdminMenuModel model = new AdminMenuModel();
        AdminMenuView view = new AdminMenuView(model.getMenuOptions());

        if (admin==null){
            admin = model.userLogin();
        }
        AdminMenuController controller = new AdminMenuController(model, view, admin);
        controller.requestUserInput();
    }
}
