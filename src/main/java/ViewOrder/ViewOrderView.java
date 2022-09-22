package ViewOrder;

import Utils.MenuPrintHandler;

import java.util.List;

public class ViewOrderView {
    public ViewOrderView(){
        MenuPrintHandler.clearScreen();
        MenuPrintHandler.appTitle();
        printManagerMenu();
    }

    public void printManagerMenu() {
        System.out.println("Manager Menu: ");
    }

    public void selectAction() {
        List<String> menuOptions = List.of("Select Order to Approve/Decline");
        MenuPrintHandler.logOut();
        MenuPrintHandler.printOptionList(menuOptions);
    }

}
