package ManagerMenu;

import Data.Item;
import HomeMenu.HomeMenu;
import SaleItem.SaleItem;
import Utils.ReadInventoryFile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ManagerMenuModel {
    private List<Item> inventory;
    private final List<String> menuOptions = List.of("View order list", "View inventory list","View transaction list");
    public List<String> getMenuOptions() {
        return menuOptions;
    }

    public List<Item> getInventory() {
        return inventory;
    }


    public void handleOption(int selectedOption) throws IndexOutOfBoundsException, IOException {
        switch (selectedOption) {
            case 0 -> new HomeMenu();
            //case 1 -> new SaleItem();
            //case 2 -> new ReturnItem();
            //case 3 -> new PlaceOrder();

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
}
