package SaleItem;

import Data.Item;
import HomeMenu.HomeMenu;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SaleItemModel {

    private final List<Item> inventory;
    List<String> saleItemOptions;

    public SaleItemModel(List<Item> inventory) {
        this.inventory = inventory;
        List<String> saleItemOptions = new ArrayList<>();
        for (Item item : inventory) {
            saleItemOptions.add(item.getId());
        }

        this.saleItemOptions = saleItemOptions;
    }
    public List<String> getsaleItemOptions() {
        return saleItemOptions;
    }
    public int handleOption(int selectedOption) throws IndexOutOfBoundsException, IOException {
        if (selectedOption == 0) {
            new HomeMenu();
        } else if (selectedOption <= saleItemOptions.size()) {
            return (selectedOption - 1);
        } else throw new IndexOutOfBoundsException();
        return selectedOption;
    }
    public List<Item> getInventory() {
        return inventory;
    }

}
