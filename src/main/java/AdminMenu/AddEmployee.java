package AdminMenu;

import Data.User;
import Utils.MenuPrintHandler;
import Utils.UserFileReader;
import Utils.UserInput;
import Utils.WriteToFile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddEmployee {
    UserInput input = new UserInput();
    List<String> allUsers;
    String EName;
    String Eid ;
    String Role;
    String Epass;
    private final Scanner scanner;

    private static String filepath = "src/main/resources/users.txt";
    public AddEmployee(){
        allUsers = UserFileReader.readTextFile();
        addNewEmployee();
        this.scanner = new Scanner(System.in);
    }


    private void addNewEmployee(){

        System.out.println("Please Select Role for new user:");
        List<String> roles = List.of("ADMIN", "MANAGER", "CASHIER");
        MenuPrintHandler.printOptionList(roles);
        int selectedRole = input.readInteger("Please select and option: ","Invalid Selection", 1,3);
        if (selectedRole==1){
         Role="ADMIN";}
        else if (selectedRole==2) {
            Role="MANAGER";}
        else  Role="CASHIER";

        System.out.print("Please Enter an user id: ");
        Eid = input.readText();

        Boolean isValidUser = verifyIfUserPresent(Eid);
        while (isValidUser){
            System.out.print("User id already exists: ");
            Eid = input.readText();
            isValidUser = verifyIfUserPresent(Eid);
        }

        System.out.print("Please Enter full Name of New Employee: ");
        EName = input.readText();

        Epass = input.passwordReader("Signup");

        User newUser = new User(Eid, Epass, EName, Role);
        String textToSave = newUser.toString();
        WriteToFile.addNewRecord(textToSave,filepath);
        input.oprationSaveSuccess();
    }

    private boolean verifyIfUserPresent(String eneteredUser){
        List<String> Users = new ArrayList<>();

        for (int index = 0;index<allUsers.size();index++){
            String user = UserFileReader.breakLineBySeparatorCharacter(allUsers.get(index), ",").get(0);
            Users.add(user);
        }
        if (Users.contains(eneteredUser)) return true;
        else return false;
    }
}
