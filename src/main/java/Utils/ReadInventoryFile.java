package Utils;


import Data.Item;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadInventoryFile {
    private  Scanner scanner;
    private  List<Item> inventory;

    public ReadInventoryFile(String pathname)  {
        try {
            File file = new File(pathname);
            scanner = new Scanner(file);
            inventory = generateInventory();
        }catch (FileNotFoundException e){
            System.out.println(e);
        }

    }

    public List<Item> getInventory() {
        return inventory;
    }

    private List<Item> generateInventory() {
        List<Item> inventory = new ArrayList<>();

        while (scanner.hasNextLine()) {
            String rawData = scanner.nextLine();
            List<String> parsedData = List.of(rawData.split(","));
            String id = parsedData.get(0);
            String name = parsedData.get(1);
            String image = parsedData.get(2);
            String description = parsedData.get(3);
            int quantity  = Integer.parseInt(parsedData.get(4));
            double price = Double.parseDouble(parsedData.get(5));
            Item newItem = new Item(id, name, image, description, quantity, price);

            inventory.add(newItem);
        }

        return inventory;
    }
}
