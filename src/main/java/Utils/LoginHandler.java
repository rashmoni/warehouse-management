package Utils;

import Data.User;
public class LoginHandler {

    public User login(){
        UserInput input = new UserInput();
        UserReader reader = new UserReader();
        System.out.print("Please Enter Username: ");
        String userName = input.readText();
        String password = input.passwordReader("login");
        String encryptPassword = Encryptor.encryptPassword(password);
        User user = reader.getUser(userName, encryptPassword);
        while (user == null) {
            System.out.println("Invalid Username/Password, Please try again: ");
            System.out.print("Please Enter Username: ");
            userName = input.readText();
            password = input.passwordReader("login");
            encryptPassword = Encryptor.encryptPassword(password);
            user = reader.getUser(userName, encryptPassword);
        }
        return user;
    }
}
