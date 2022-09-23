package CashierMenu;

import Data.Item;
import Data.User;
import HomeMenu.HomeMenu;
import SaleItem.SaleItem;
import Utils.LoginHandler;
import Utils.ReadInventoryFile;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import PlaceOrder.*;

public class CashierMenuModel {
    private List<Item> inventory;
    private final List<String> menuOptions = List.of("Sell Item","Place Order","Return Item");
    public List<String> getMenuOptions() {
        return menuOptions;
    }
    public List<Item> getInventory() {
        return inventory;
    }
    private User cashier;

    public CashierMenuModel(User cashier){
        this.cashier=cashier;
    }

    public void handleOption(int selectedOption) throws IndexOutOfBoundsException, IOException {
        switch (selectedOption) {
            case 0 -> new HomeMenu();
            case 1 -> new SaleItem(inventory,cashier);
            case 2 -> new PlaceOrder(inventory,cashier);
            //case 3 -> new ReturnItem();
            default -> throw new IndexOutOfBoundsException();
        }
    }
    public List<List<String>> parseData() {
        readInventory();
        List<List<String>> result = new ArrayList<>();
        for (Item item: inventory) {
            List<String> data = List.of(item.getId(), item.getName(), item.getImage(), item.getDescription(), String.valueOf(item.getQuantity()), String.valueOf(item.getPrice()));

            result.add(data);
        }

        return result;
    }
    private void readInventory() {
        ReadInventoryFile inventoryFile = new ReadInventoryFile("src/main/resources/inventory.txt");
        this.inventory = inventoryFile.getInventory();
    }

    public User userLogin(){
        LoginHandler handler = new LoginHandler();
        cashier = handler.login();
        return cashier;
    };

}

