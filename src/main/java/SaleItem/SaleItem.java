package SaleItem;

public class SaleItem {

    public SaleItem() {
        SaleItemModel model = new SaleItemModel();
        SaleItemView view = new SaleItemView();
        SaleItemController controller = new SaleItemController(model, view);

        controller.requestUserInput();
    }
}
