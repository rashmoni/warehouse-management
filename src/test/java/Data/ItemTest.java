package Data;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ItemTest {

    @Test
    void testConstructor() {
        Item actualItem = new Item("42", "John", "Image", "The characteristics of someone or something", 1, 10.0d);
        String actualToStringResult = actualItem.toString();
        assertEquals("The characteristics of someone or something", actualItem.getDescription());
        assertEquals("42", actualItem.getId());
        assertEquals("Image", actualItem.getImage());
        assertEquals("John", actualItem.getName());
        assertEquals(10.0d, actualItem.getPrice());
        assertEquals(1, actualItem.getQuantity());
        assertEquals("42,John,Image,The characteristics of someone or something,1,10.0", actualToStringResult);
    }


}

