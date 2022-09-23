package Data;

import Utils.Encryptor;

public record User(String id, String password, String name, UserRole role) {

    @Override
    public String password() {
        return Encryptor.encryptPassword(password);
    }

    @Override
    public String toString() {
        return (id + "," + password() + "," + name + "," + role);
    }
}
