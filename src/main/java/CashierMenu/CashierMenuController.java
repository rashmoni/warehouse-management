package CashierMenu;

import Data.User;
import Utils.*;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class CashierMenuController {
    private final CashierMenuModel model;
    private final CashierMenuView view;

    private final Scanner scanner;

    public CashierMenuController(CashierMenuModel model, CashierMenuView view) {
        this.model = model;
        this.view = view;
        this.scanner = new Scanner(System.in);
    }


    public void requestUserInput(User cashier) {
        System.out.println("Welcome: "+cashier.name());
        printInventoryTable();
        System.out.println("Cashier Menu: ");
        MenuPrintHandler.logOut();
        view.printOptions();
        view.printUserPrompt();

        String input = scanner.nextLine();

        try {
            int selectedOption = Integer.parseInt(input);

            model.handleOption(selectedOption);
        } catch (NumberFormatException | IndexOutOfBoundsException | IOException exception) {
            view.printInvalidOption();
            requestUserInput(cashier);
        }
    }


    private void printInventoryTable(){
        List<String> header = List.of("ID", "Name", "Image","Description","Quantity","Price");
        List<Integer> columnWidths = List.of(5,15,5,30,10,10);
        List<List<String>> data = model.parseData();
        PrintTable table = new PrintTable(header,data,columnWidths);
        table.showData();
    }
}


