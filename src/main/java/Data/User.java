package Data;

import Utils.Encryptor;

public class User {
    private String id;
    private String password;
    private String name;
    private String role;

    public User(String id, String password, String name, String role) {
        this.id = id;
        this.password = password;
        this.name = name;
        this.role = role;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    public String getPassword() {
        String encPassword = Encryptor.encryptPassword(password);
        return encPassword;
    }

    @Override
    public String toString() {
        return  (id + ","+ getPassword()+"," + name + "," + role);
    }
}
