package AdminMenu;


import Utils.MenuPrintHandler;

import java.util.List;

public class AdminMenuView {
    private final List<String> menuOptions;
    public AdminMenuView(List<String> menuOptions) {
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




