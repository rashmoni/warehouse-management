package Utils;


import java.io.Console;
import java.util.Scanner;

public class UserInput {
    private final Scanner in;

    public UserInput() {
        in = new Scanner(System.in);
    }

    public int readInteger(String promptMsg, String errorMsg, int low, int high) {
        int num = 0;
        String strInput;
        boolean valid = false;
        while (!valid) {
            System.out.print(promptMsg);
            strInput = in.nextLine();

            try {
                num = Integer.parseInt(strInput);
                if (num >= low && num <= high)
                    valid = true;
                else
                    System.out.println(errorMsg);
            } catch (NumberFormatException e) {
                System.out.println(errorMsg);
            }
        }
        return num;
    }

    public String readText() {
        String strInput;
        strInput = in.nextLine();

        while ((strInput.equals("") || (strInput.equals(" ")))) {
            System.out.print("\u26A0 Invalid Entry, Please enter value: ");
            strInput = in.nextLine().trim();
        }
        return strInput;
    }


    public String passwordReader(String type) {
        Console console = System.console();
        String userPassword;
        if (console != null) {
            userPassword = consolePasswordReader(type);
        } else {
            userPassword = terminalPasswordReader(type);
        }
        return userPassword;
    }

    private String consolePasswordReader(String type) {
        char[] passwordChars;
        String passwordString;
        char[] rePasswordChars;
        String rePasswordString;

        Console console = System.console();
        if (type.equalsIgnoreCase("login")) {
            console.printf("Please enter your password: ");
            passwordChars = console.readPassword();
            passwordString = new String(passwordChars);
            return passwordString;
        } else {
            console.printf("Please enter new password: ");
            passwordChars = console.readPassword();
            passwordString = new String(passwordChars);
            console.printf("Re-Enter the password: ");
            rePasswordChars = console.readPassword();
            rePasswordString = new String(rePasswordChars);
            while (!passwordString.equals(rePasswordString) || (passwordString.length() < 6)) {
                console.printf("Password does match/ Less than 6 characters");
                console.printf("\n" + "Please try again:");
                console.printf("Please enter new password: ");
                passwordChars = console.readPassword();
                passwordString = new String(passwordChars);
                console.printf("Re-Enter the password: ");
                rePasswordChars = console.readPassword();
                rePasswordString = new String(rePasswordChars);
            }
            return passwordString;
        }
    }

    //below code is only when running from intelliJ
    private String terminalPasswordReader(String type) {
        String passwordString;
        String rePasswordString;

        if (type.equalsIgnoreCase("login")) {
            System.out.print("Please enter your password: ");
            passwordString = in.nextLine();
            return passwordString;
        } else {
            System.out.print("Please enter new password: ");
            passwordString = in.nextLine();
            System.out.print("Re-Enter the password: ");
            rePasswordString = in.nextLine();
            while (!passwordString.equals(rePasswordString) || (passwordString.length() < 6)) {
                System.out.println("Password does not match (or) Less than 6 characters");
                System.out.println("Please try again: ");
                System.out.print("Please enter new password: ");
                passwordString = in.nextLine();
                System.out.print("Re-Enter the password: ");
                rePasswordString = in.nextLine();
            }
            return passwordString;
        }
    }

    public void pressEnterContinue() {
        System.out.print("Press Enter to continue...");
        in.nextLine();
    }


}
