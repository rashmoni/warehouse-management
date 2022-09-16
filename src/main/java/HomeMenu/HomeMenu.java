package HomeMenu;

public class HomeMenu {
    public HomeMenu()  {
        HomeMenuModel model = new HomeMenuModel();
        HomeMenuView view = new HomeMenuView(model.getHomeMenuOptions());
        HomeMenuController controller = new HomeMenuController(model, view);

        controller.requestUserInput();
    }
}
