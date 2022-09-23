package AdminMenu;

import Data.User;
import HomeMenu.HomeMenu;
import Utils.LoginHandler;
import java.io.IOException;
import java.util.List;

public class AdminMenuModel {
    private final List<String> menuOptions = List.of("Add employee", "Pay salary","View financial");
    public List<String> getMenuOptions() {
        return menuOptions;
    }
    private User admin;


    public void handleOption(int selectedOption) throws IndexOutOfBoundsException, IOException {
        switch (selectedOption) {
            case 0 -> new HomeMenu();
            case 1 -> new AddEmployee(admin);
            //case 2 -> new PaySalay();
            //case 3 -> new ViewFinancials();
            default -> throw new IndexOutOfBoundsException();
        }
    }



    public User userLogin(){
        LoginHandler handler = new LoginHandler();
        admin = handler.login();
        return admin;
    }
}
