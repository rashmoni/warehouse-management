package Data;

import org.junit.jupiter.api.Test;

class TransactionTest {

    @Test
    void testConstructor() {

        (new Transaction("42", 1, 10.0d)).toString();
    }


    @Test
    void testConstructor2() {

        new Transaction("42", 1, 10.0d);

    }
}

