package PlaceOrder;


public class PlaceOrder {
    public PlaceOrder() {
        PlaceOrderModel model = new PlaceOrderModel();
        PlaceOrderView  view = new PlaceOrderView();
        PlaceOrderController controller = new PlaceOrderController();

        controller.requestUserInput();
    }
}
