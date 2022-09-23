package Data;

public class Item {
    private final String id;
    private final String name;
    private final String image;
    private final String description;
    private final int quantity;
    private final double price;


    public Item(String id, String name, String image, String description, int quantity, double price) {
        this.id = id;
        this.name = name;
        this.image= image;
        this.description=description;
        this.quantity = quantity;
        this.price = price;
    }

    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getImage() {
        return image;
    }
    public String getDescription() {
        return description;
    }
    public int getQuantity() {
        return quantity;
    }
    public double getPrice() {
        return price;
    }


    @Override
    public String toString(){
        return id+","+name+","+image+"," + description+ ","+quantity+","+price;
    }
}
