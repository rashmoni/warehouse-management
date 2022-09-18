package AdminMenu;

public class AdminMenu {
    public AdminMenu() {

        AdminMenuModel model = new AdminMenuModel();
        AdminMenuView view = new AdminMenuView(model.getMenuOptions());
        AdminMenuController controller = new AdminMenuController(model, view);

        controller.requestUserInput();
    }
}
