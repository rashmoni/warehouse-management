package ManagerMenu;


import HomeMenu.HomeMenu;
import ViewOrder.*;
import java.io.IOException;
import java.util.List;

public class ManagerMenuModel {
    private final List<String> menuOptions = List.of("View order", "View inventory","View transaction");
    public List<String> getMenuOptions() {
        return menuOptions;
    }

    public void handleOption(int selectedOption) throws IndexOutOfBoundsException, IOException {
        switch (selectedOption) {
            case 0 -> new HomeMenu();
            case 1 -> new ViewOrder();
            //case 2 -> new ReturnItem();
            //case 3 -> new PlaceOrder();

            default -> throw new IndexOutOfBoundsException();
        }
    }

}
