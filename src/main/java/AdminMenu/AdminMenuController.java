package AdminMenu;

import Data.User;
import Utils.MenuPrintHandler;
import java.io.IOException;
import java.util.Scanner;

public class AdminMenuController {
    private final AdminMenuModel model;
    private final AdminMenuView view;
    private final Scanner scanner;
    private final User admin;

    public AdminMenuController(AdminMenuModel model, AdminMenuView view, User admin) {
        this.model = model;
        this.view = view;
        this.admin = admin;
        this.scanner = new Scanner(System.in);
    }

    public void requestUserInput() {
        System.out.println("Welcome: " + admin.name());
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
