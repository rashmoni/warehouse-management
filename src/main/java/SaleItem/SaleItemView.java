package SaleItem;

import Utils.MenuPrintHandler;

import java.util.List;

public class SaleItemView {
    public SaleItemView(List<String> saleItemOptions) {
        MenuPrintHandler.clearScreen();
        MenuPrintHandler.appTitle();
        userMessage();
        MenuPrintHandler.goBack();
        MenuPrintHandler.printOptionList(saleItemOptions);
        printUserPrompt();
    }

    public void printUserPrompt() {
        System.out.print("Please choose and option: ");
    }
    public void userMessage() {
        System.out.println("Please select an item you want to sell: ");
    }
    public void chooseQuantity() {System.out.print("Please enter number of items for sell: ");}
    public void invalidEntry(){
        System.out.println("❌ Quantity not available");
    }
    public void sellSuccess(){
        System.out.println("✅ Items successfully sold");
    }
}


