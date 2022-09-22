package Utils;

import java.util.Arrays;
import java.util.List;

public class Table {
    // Properties
    List<String> header;
    List<List<String>> body;
    List<Integer> columnWidths;
    String format;

    // Constructor
    public Table(List<String> header, List<List<String>> body, List<Integer> columnWidths) {
        this.header = header;
        this.body = body;
        this.columnWidths = columnWidths;
        this.format = createFormat(columnWidths);
    }

    // Public
    public void showData() {
        generateBorder();
        generateHeader();
        generateBorder();
        generateBody();
        generateBorder();
    }

    // Private
    private String createFormat(List<Integer> columnWidths) {
        StringBuilder result = new StringBuilder();

        for (Integer item : columnWidths) {
            result.append("| %-").append(item).append("s ");
        }
        result.append("|%n");

        return result.toString();
    }

    private String createBorderCell(int width) {
        char character = '-';
        int padding = 2;
        char[] repeatCharacters = new char[width + padding];
        String result;

        Arrays.fill(repeatCharacters, character);
        result = new String(repeatCharacters);

        return result;
    }

    private void generateBorder() {
        StringBuilder result = new StringBuilder();

        for (Integer item : columnWidths) {
            String cell = createBorderCell(item);

            result.append("+").append(cell);
        }
        result.append("+");

        System.out.println(result);
    }

    private void generateHeader() {
        System.out.format(format, header.toArray());
    }

    private void generateBody() {
        for (List<String> item : body) {
            System.out.format(format, item.toArray());
        }
    }
}

