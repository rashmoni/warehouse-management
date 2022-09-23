package AdminMenu;

import Data.User;
import Utils.*;

import java.io.IOException;
import java.util.Scanner;

public class AdminMenuController {
    private final AdminMenuModel model;
    private final AdminMenuView view;
    private final Scanner scanner;
    public AdminMenuController(AdminMenuModel model, AdminMenuView view) {
        this.model = model;
        this.view = view;
        this.scanner = new Scanner(System.in);
    }

    public void requestUserInput() {
        LoginHandler handler = new LoginHandler();
        User Admin = handler.login();
        System.out.println("Welcome: " + Admin.getName());
        System.out.println("Admin Menu: ");
        MenuPrintHandler.logOut();
        view.printOptions();
        view.printUserPrompt();


        String input = scanner.nextLine();

        try {
            int selectedOption = Integer.parseInt(input);

            model.handleOption(selectedOption);
        } catch (NumberFormatException | IndexOutOfBoundsException | IOException exception) {
            view.printInvalidOption();
            requestUserInput();
        }
    }


}
