package Data;

import Utils.GenerateRecOrdStrings;

import java.util.Date;

public class Order {
    private final String orderId;
    private final Date date;
    private final String itemId;
    private final String itemName;
    private final int orderQuantity;
    private final OrderStatus status;

    public Order(String itemId, String itemName, int orderQuantity, OrderStatus status) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.orderQuantity = orderQuantity;
        this.status = status;
        orderId = GenerateRecOrdStrings.GenerateOrderNum();
        date = new Date();
    }

    public Order(String orderId, String itemId, Date date, String itemName, int orderQuantity, OrderStatus status) {
        this.orderId=orderId;
        this.itemId = itemId;
        this.itemName = itemName;
        this.date=date;
        this.orderQuantity = orderQuantity;
        this.status = status;
    }

    public String getOrderId() {
        return orderId;
    }

    public String getItemId() {
        return itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public int getOrderQuantity() {
        return orderQuantity;
    }

    public OrderStatus getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return (orderId + "," + itemId + "," +date+","+ itemName + "," + orderQuantity + "," + status);
    }
}
