package ViewOrder;

import CashierMenu.CashierMenuController;
import CashierMenu.CashierMenuModel;
import CashierMenu.CashierMenuView;
import Data.User;

public class ViewOrder {
    public ViewOrder() {
        ViewOrderModel model = new ViewOrderModel();
        ViewOrderView view = new ViewOrderView();

        ViewOrderController controller = new ViewOrderController(model, view);
    }
}
