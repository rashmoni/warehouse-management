package PlaceOrder;

import CashierMenu.CashierMenu;
import Data.Item;
import Data.Transaction;
import Data.User;
import SaleItem.SaleItemModel;
import SaleItem.SaleItemView;
import Utils.FileWriter;
import Utils.UserInput;

import java.io.IOException;
import java.util.Scanner;

public class PlaceOrderController {
    private final PlaceOrderModel model;
    private final PlaceOrderView view;
    private final User cashier;
    private final Scanner scanner;
    UserInput input = new UserInput();

    public PlaceOrderController(PlaceOrderModel model, PlaceOrderView view, User user) {
        this.model = model;
        this.view = view;
        this.cashier = user;
        this.scanner = new Scanner(System.in);
    }

    public void requestUserInput() {
        String input = scanner.nextLine();
        int selectedItem;
        try {
            int selectedOption = Integer.parseInt(input);

            selectedItem = model.handleOption(selectedOption);
            sellItem(selectedItem);
        } catch (NumberFormatException | IndexOutOfBoundsException | IOException exception) {
            requestUserInput();
        }
    }

    public void sellItem(int selectedItem) {
        view.chooseQuantity();
        String input = scanner.nextLine();
        try {
            int selectedQuantity = Integer.parseInt(input);

            handleQuantity(selectedItem, selectedQuantity);
        } catch (NumberFormatException | IndexOutOfBoundsException exception) {
            requestUserInput();
        }
    }

    private void handleQuantity(int selectedItem, int selectedQuantity) {
        int availableItems = model.getInventory().get(selectedItem).getQuantity();
        String id = model.getInventory().get(selectedItem).getId();
        String name = model.getInventory().get(selectedItem).getName();
        String image = model.getInventory().get(selectedItem).getImage();
        String description = model.getInventory().get(selectedItem).getDescription();
        double price = model.getInventory().get(selectedItem).getPrice();

        if (availableItems > selectedQuantity) {
            int updatedQuantity = availableItems - selectedQuantity;
            Item item = new Item(id, name, image, description, updatedQuantity, price);
            String inventoryFilepath = "src/main/resources/inventory.txt";
            FileWriter.updateRecord(item.getId(), item.toString(), inventoryFilepath);
            Transaction transaction = new Transaction(id, selectedQuantity, price);
            String transactionsFilepath = "src/main/resources/transactions.txt";
            FileWriter.addNewRecord(transaction.toString(), transactionsFilepath);
            view.sellSuccess();
            input.pressEnterContinue();
            new CashierMenu(cashier);
        } else {
            view.invalidEntry();
            sellItem(selectedItem);
        }
    }

}
