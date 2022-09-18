package ManagerMenu;

import Utils.MenuPrintHandler;

import java.util.List;

public class ManagerMenuView {
    private List<String> menuOptions;
    public ManagerMenuView(List<String> menuOptions) {
        this.menuOptions = menuOptions;

        MenuPrintHandler.clearScreen();
        MenuPrintHandler.appTitle();
    }

    public void printInvalidOption() {
        System.out.println("⚠️ Invalid option");
    }

    public void printUserPrompt() {
        System.out.print("Choose an option and press enter: ");
    }


    public void printOptions(){
        MenuPrintHandler.printOptionList(menuOptions);
    }
}
