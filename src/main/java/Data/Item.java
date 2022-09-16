package Data;

public class Item {
    private String id;
    private String name;
    private String image;
    private String description;
    private int quantity;
    private double price;


    public Item(String id, String name, String image, String description, int quantity, double price) {
        this.id = id;
        this.name = name;
        this.image= image;
        this.description=description;
        this.quantity = quantity;
        this.price = price;
    }

    public String getByKey(String key) {
        String result = "";

        switch (key) {
            case "id" -> result = id;
            case "name" -> result = name;
            default -> System.out.println("🚨 ERROR INVALID KEY" + key);
        }

        return result;
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
        return id+" "+name+" "+image+" " + description+ " "+quantity+" "+price;
    }
}
