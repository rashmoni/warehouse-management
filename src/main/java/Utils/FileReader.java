package Utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileReader {
    private static String filepath = "src/main/resources/users.txt";
    public static List<String> readTextFile() {
        List<String> result = new ArrayList<>();
        try {
            File textFile = new File(filepath);
            Scanner scanner = new Scanner(textFile);
            while (scanner.hasNextLine()) {
                result.add(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not present");
        }
        return result;
    }

    public static List<String> breakLineBySeparatorCharacter(String line, String separatorCharacter) {
        List<String> result = List.of(line.split(separatorCharacter));
        return result;
    }
}

