package Utils;

import Data.User;
import Data.UserRole;

import java.util.List;

public class UserReader {
    public User getUser(String userName, String password) {
        User user = null;
        List<String> allUsers = UserFileReader.readTextFile();
        for (String allUserString : allUsers) {
            List<String> customerDataList = UserFileReader.breakLineBySeparatorCharacter(allUserString, ",");
            if (userName.equals(customerDataList.get(0)) && password.equals(customerDataList.get(1))) {
                user = new User(customerDataList.get(0), customerDataList.get(1), customerDataList.get(2), UserRole.valueOf(customerDataList.get(3)));
            }
        }
        return user;
    }
}