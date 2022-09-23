package Data;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class OrderStatusTest {



    @Test
    void testValueOf2() {

        OrderStatus.valueOf("APPROVED");
    }

    @Test
    void testValueOf3() {


        OrderStatus.valueOf("DECLINED");
    }

    @Test
    void testValueOf4() {


        OrderStatus.valueOf("PENDING");
    }

}

