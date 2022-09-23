package PlaceOrder;

import CashierMenu.CashierMenu;
import Data.Order;
import Data.OrderStatus;
import Data.User;
import Utils.WriteToFile;
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
            orderItem(selectedItem);
        } catch (NumberFormatException | IndexOutOfBoundsException | IOException exception) {
            requestUserInput();
        }
    }

    public void orderItem(int selectedItem) {
        view.chooseQuantity();
        String input = scanner.nextLine();
        try {
            int selectedQuantity = Integer.parseInt(input);

            handleOrder(selectedItem, selectedQuantity);
        } catch (NumberFormatException | IndexOutOfBoundsException exception) {
            requestUserInput();
        }
    }

    private void handleOrder(int selectedItem, int selectedQuantity) {
        String orderFilepath = "src/main/resources/orders.txt";
        String id = model.getInventory().get(selectedItem).getId();
        String name = model.getInventory().get(selectedItem).getName();

        Order order = new Order(id,name,selectedQuantity, OrderStatus.PENDING);
        System.out.println(order);
        WriteToFile.addNewRecord(order.toString(), orderFilepath);
        view.orderSuccess();
        input.pressEnterContinue();
        new CashierMenu(cashier);

    }

}
