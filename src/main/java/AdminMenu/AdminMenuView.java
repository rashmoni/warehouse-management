package AdminMenu;


import Utils.MenuPrintHandler;

public class AdminMenuView {
    public AdminMenuView() {
            MenuPrintHandler.clearScreen();
            MenuPrintHandler.appTitle();
        }

        public void printUserNamePrompt() {
            System.out.print("Please Enter Username: ");
        }

        public void printInvalidCred() {
            System.out.println("⚠️ Invalid username/password, please try again: ");
        }

    }

