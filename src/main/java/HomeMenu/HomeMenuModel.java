package HomeMenu;
import AdminMenu.*;
import CashierMenu.CashierMenu;
import ManagerMenu.ManagerMenu;
import java.io.IOException;
import java.util.List;

public class HomeMenuModel {
    private final List<String> homeMenuOptions = List.of("Admin", "Cashier","Manager");
    public List<String> getHomeMenuOptions() {
        return homeMenuOptions;
    }

    public void handleOption(int selectedOption) throws IndexOutOfBoundsException, IOException {
        switch (selectedOption) {
            case 1 -> new AdminMenu();
            case 2 -> new CashierMenu();
            case 3 -> new ManagerMenu();
            default -> throw new IndexOutOfBoundsException();
        }
    }
}
