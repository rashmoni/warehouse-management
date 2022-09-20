package PlaceOrder;


import Data.Item;
import Data.User;

import java.util.List;

public class PlaceOrder {
    public PlaceOrder(List<Item> inventory, User user) {
        PlaceOrderModel model = new PlaceOrderModel(inventory);
        PlaceOrderView  view = new PlaceOrderView(model.getplaceorderOptions());
        PlaceOrderController controller = new PlaceOrderController(model, view, user);

        controller.requestUserInput();
    }
}
