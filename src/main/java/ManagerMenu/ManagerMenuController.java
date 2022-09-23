package ManagerMenu;


import Data.User;
import Utils.LoginHandler;
import Utils.MenuPrintHandler;

import java.io.IOException;
import java.util.Scanner;

public class ManagerMenuController {
    private final ManagerMenuModel model;
    private final ManagerMenuView view;
    private final Scanner scanner;

    public ManagerMenuController(ManagerMenuModel model, ManagerMenuView view) {
        this.model = model;
        this.view = view;
        this.scanner = new Scanner(System.in);
    }

    public void requestUserInput() {
        LoginHandler handler = new LoginHandler();
        User manager = handler.login();
        System.out.println("Welcome: " + manager.name());
        //printInventoryTable();
        System.out.println("Manager Menu: ");
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
