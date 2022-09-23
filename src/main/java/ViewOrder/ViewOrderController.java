package ViewOrder;


import HomeMenu.HomeMenu;
import Utils.PrintTable;
import Utils.UserInput;
import java.util.List;
import java.util.Scanner;

public class ViewOrderController {

    private final ViewOrderModel model;
    private final ViewOrderView view;
    List<List<String>> orders;
    private final Scanner scanner;

    UserInput input = new UserInput();

    public ViewOrderController(ViewOrderModel model, ViewOrderView view) {
        this.model = model;
        this.view = view;
        this.scanner = new Scanner(System.in);
        this.orders= model.getOrders();

        printInventoryTable();
    }

    private void printInventoryTable(){
        List<String> header = List.of("OrderID", "ID", "Date","Name","Quantity","Status");
        List<Integer> columnWidths = List.of(10,5,20,10,5,6);
        PrintTable table = new PrintTable(header,orders,columnWidths);
        table.showData();
        view.selectAction();
        input.readInteger("Please Select an option: ","⚠️Invalid Option",0,0);
        new HomeMenu();
    }
}
