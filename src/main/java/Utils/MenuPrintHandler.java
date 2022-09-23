package Utils;


import java.io.IOException;
import java.util.List;

public class MenuPrintHandler {
    public static void appTitle() {
        System.out.println("=== MiNet’s Warehouse Management System ===" + "\n");
    }

    public static void logOut() {
        System.out.println("[0] Logout");
    }

    public static void goBack() {
        System.out.println("[0] Go Back");
    }
    public static void clearScreen() {
        String OperatingSystem = System.getProperty("os.name");

        if (OperatingSystem.equals("Windows")) {
            clearScreenWindows();
        } else {
            clearScreenUnix();
        }
    }
    public static void printOptionList(List<String> options) {
        for (int index = 0; index < options.size(); index++) {
            int number = index + 1;
            String label = options.get(index);

            System.out.println("[" + number + "] " + label);
        }
    }

    private static void clearScreenUnix() {
        String clearScreenASCIICode = "\033[H\033[2J";

        System.out.print(clearScreenASCIICode);
        System.out.flush();
    }
    private static void clearScreenWindows() {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (IOException | InterruptedException error) {
            System.out.println("A minor problem happened with the app. It will work but may not display correctly");
        }
    }

}