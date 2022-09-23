package Data;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class UserTest {

    @Test
    void testConstructor() {
        User actualUser = new User("42", "iloveyou", "Name", "Role");
        String actualToStringResult = actualUser.toString();
        assertEquals("42", actualUser.getId());
        assertEquals("Name", actualUser.getName());
        assertEquals("Role", actualUser.getRole());
        assertEquals("42 Name Role", actualToStringResult);
    }
}

