package Utils;


import java.io.*;
import java.util.Scanner;

public class WriteToFile {
    private static Scanner scanner;
    public static void updateRecord(String editTerm, String updatedText, String  filePath) {
        String tempFile = "temp.txt";
        File oldFile = new File(filePath);
        File newFile = new File(tempFile);
        try {
            java.io.FileWriter fw = new java.io.FileWriter(tempFile, true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            scanner = new Scanner(new File(filePath));

            while (scanner.hasNextLine()) {
                String scannedLine = scanner.nextLine();
                int firstComma = scannedLine.indexOf(",");
                if (scannedLine.substring(0, firstComma).equals(editTerm)) {
                    pw.print(updatedText + "\n");
                } else
                    pw.print(scannedLine + "\n");
            }
            scanner.close();
            pw.flush();
            pw.close();
            oldFile.delete();
            File dump = new File(filePath);
            newFile.renameTo(dump);
        } catch (IOException e) {
            System.out.println("Error when updating the File ");
            throw new RuntimeException(e);
        }
    }

    public static void addNewRecord(String textToSave, String filePath) {
        File file = new File(filePath);
        try {
            FileWriter writer = new FileWriter(file, true);
            PrintWriter dataOut = new PrintWriter(writer);
            dataOut.print("\n" + textToSave);
            dataOut.flush();
            dataOut.close();
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

