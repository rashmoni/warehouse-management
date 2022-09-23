package Utils;

import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

class ReadOrderFileTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link ReadOrderFile#ReadOrderFile(String)}
     *   <li>{@link ReadOrderFile#getOrders()}
     * </ul>
     */
    @Test
    void testConstructor() {
        assertNull((new ReadOrderFile("Pathname")).getOrders());
    }
}

