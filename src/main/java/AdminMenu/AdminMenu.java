package AdminMenu;

public class AdminMenu {
    public AdminMenu() {

        AdminMenuModel model = new AdminMenuModel();
        AdminMenuView view = new AdminMenuView();
        AdminMenuController controller = new AdminMenuController(model, view);

        controller.requestUserInput();
    }
}
