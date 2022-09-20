package PlaceOrder;

import Utils.MenuPrintHandler;

import java.util.List;

public class PlaceOrderView {
    public PlaceOrderView(List<String> placeorderOptions) {
        MenuPrintHandler.clearScreen();
        MenuPrintHandler.appTitle();
        userMessage();
        MenuPrintHandler.goBack();
        MenuPrintHandler.printOptionList(placeorderOptions);
        printUserPrompt();
    }

    public void printUserPrompt() {
        System.out.print("Please choose and option: ");
    }
    public void userMessage() {
        System.out.println("Please select an item you want to place order: ");
    }
    public void chooseQuantity() {System.out.print("Please enter number of items: ");}
    public void orderSuccess(){
        System.out.println("✅ Order placed! Pending Manager approval");
    };
}






