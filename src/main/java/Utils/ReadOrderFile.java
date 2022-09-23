package Utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadOrderFile {

    private Scanner scanner;
    private List<List<String>> orders;

    public ReadOrderFile(String pathname) {
        try {
            File file = new File(pathname);
            scanner = new Scanner(file);
            orders = generateOrders();
        } catch (FileNotFoundException | ParseException e) {
            System.out.println("File now found"+e);
        }
    }

    public List<List<String>> getOrders() {
        return orders;
    }
    private List<List<String>> generateOrders() throws ParseException {
        List<List<String>> orders = new ArrayList<>();

        while (scanner.hasNextLine()) {
            String rawData = scanner.nextLine();
            List<String> parsedData = List.of(rawData.split(","));
            orders.add(parsedData);
        }
        return orders;
    }
}
