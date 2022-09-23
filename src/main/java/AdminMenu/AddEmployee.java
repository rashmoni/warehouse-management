package AdminMenu;

import Data.User;
import Data.UserRole;
import Utils.MenuPrintHandler;
import Utils.UserFileReader;
import Utils.UserInput;
import Utils.WriteToFile;
import java.util.ArrayList;
import java.util.List;

public class AddEmployee {
    UserInput input = new UserInput();
    List<String> allUsers;
    String EName;
    String Eid;
    UserRole Role;
    String Epass;

    User admin;

    public AddEmployee(User admin) {
        this.admin=admin;
        allUsers = UserFileReader.readTextFile();
        addNewEmployee();
    }


    private void addNewEmployee() {
        Role = getRole();
        Eid = getEid();
        EName = getEname();
        Epass = input.passwordReader("Signup");

        User newUser = new User(Eid, Epass, EName, Role);

        String textToSave = newUser.toString();
        String filepath = "src/main/resources/users.txt";
        WriteToFile.addNewRecord(textToSave, filepath);
        System.out.println("New Employee " + EName +" added.");
        input.pressEnterContinue();
        new AdminMenu(admin);

    }

    private UserRole getRole() {
        UserRole role = null;
        System.out.println("Please Select Role for new user:");
        List<String> roles = List.of("ADMIN", "MANAGER", "CASHIER");
        MenuPrintHandler.printOptionList(roles);
        int selectedRole = input.readInteger("Please select and option: ", "Invalid Selection", 1, 3);
        switch (selectedRole) {
            case 1 -> role = UserRole.ADMIN;
            case 2 -> role = UserRole.MANAGER;
            case 3 -> role = UserRole.CASHIER;
        }
        return role;
    }

    private String getEid() {
        System.out.print("Please Enter an user id: ");
        String eid = input.readText();

        boolean isValidUser = verifyIfUserPresent(eid);
        while (isValidUser) {
            System.out.print("User id already exists: ");
            eid = input.readText();
            isValidUser = verifyIfUserPresent(eid);
        }

        return eid;
    }


    private String getEname() {
        System.out.print("Please Enter full Name of New Employee: ");
        return input.readText();
    }

    private boolean verifyIfUserPresent(String eneteredUser) {
        List<String> Users = new ArrayList<>();

        for (String allUser : allUsers) {
            String user = UserFileReader.breakLineBySeparatorCharacter(allUser, ",").get(0);
            Users.add(user);
        }
        return Users.contains(eneteredUser);
    }
}
