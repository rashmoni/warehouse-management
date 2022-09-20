package SaleItem;

import Data.Item;
import Data.User;

import java.util.List;

public class SaleItem {

    public SaleItem(List<Item> inventory, User user) {
        SaleItemModel model = new SaleItemModel(inventory);
        SaleItemView view = new SaleItemView(model.getsaleItemOptions());
        SaleItemController controller = new SaleItemController(model, view, user);

        controller.requestUserInput();
    }
}
