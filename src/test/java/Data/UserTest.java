package Data;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class UserTest {

    @Test
    void testConstructor() {
        User actualUser = new User("42", "abc123", "Name", UserRole.MANAGER);
        String actualToStringResult = actualUser.toString();
        assertEquals("42", actualUser.id());
        assertEquals("Name", actualUser.name());
        assertEquals("MANAGER", actualUser.role().toString());
    }
}

