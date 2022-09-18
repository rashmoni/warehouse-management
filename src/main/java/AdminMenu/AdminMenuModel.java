package AdminMenu;

import Data.Item;
import Data.User;
import Utils.ReadInventoryFile;

import java.util.ArrayList;
import java.util.List;

public class AdminMenuModel {
    private List<Item> inventory;
    private final List<String> menuOptions = List.of("Hire employee", "Pay salary","View financial");
    public List<String> getMenuOptions() {
        return menuOptions;
    }

    public List<Item> getInventory() {
        return inventory;
    }


    public void handleOption(int Selectedoption) {

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
