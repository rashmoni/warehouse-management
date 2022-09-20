package PlaceOrder;

import Data.Item;
import Data.User;
import HomeMenu.HomeMenu;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PlaceOrderModel {
    private final List<Item> inventory;
    List<String> placeorderOptions;

    public PlaceOrderModel(List<Item> inventory) {
        this.inventory = inventory;
        List<String> placeorderOptions = new ArrayList<>();
        for (Item item : inventory) {
            placeorderOptions.add(item.getId());
        }

        this.placeorderOptions = placeorderOptions;
    }
    public List<String> getplaceorderOptions() {
        return placeorderOptions;
    }
    public int handleOption(int selectedOption) throws IndexOutOfBoundsException, IOException {
        if (selectedOption == 0) {
            new HomeMenu();
        } else if (selectedOption <= placeorderOptions.size()) {
            return (selectedOption - 1);
        } else throw new IndexOutOfBoundsException();
        return selectedOption;
    }
    public List<Item> getInventory() {
        return inventory;
    }


}
