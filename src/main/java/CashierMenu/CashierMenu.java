package CashierMenu;


import Data.User;

public class CashierMenu {

    public CashierMenu(User cashier) {
        CashierMenuModel model = new CashierMenuModel(cashier);
        CashierMenuView view = new CashierMenuView(model.getMenuOptions());

        if (cashier==null){
            cashier = model.userLogin();
        }

        CashierMenuController controller = new CashierMenuController(model, view);
        controller.requestUserInput(cashier);
    }
}
