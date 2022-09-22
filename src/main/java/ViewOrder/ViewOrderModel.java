package ViewOrder;


import Utils.ReadOrderFile;
import java.util.List;

public class ViewOrderModel {
    private List<List<String>> orders;

    public ViewOrderModel(){
        this.orders=readOrderFile();
    }
    public List<List<String>> getOrders() {
        return orders;
    }
    private List<List<String>> readOrderFile() {
        ReadOrderFile orderFile = new ReadOrderFile("src/main/resources/orders.txt");
        List<List<String>> orders = orderFile.getOrders();
        return orders;
    }

}
