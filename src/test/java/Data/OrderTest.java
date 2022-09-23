package Data;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

import org.junit.jupiter.api.Test;

class OrderTest {

    @Test
    void testConstructor() {
        LocalDateTime atStartOfDayResult = LocalDate.of(1970, 1, 1).atStartOfDay();
        Order actualOrder = new Order("42", "42", Date.from(atStartOfDayResult.atZone(ZoneId.of("UTC")).toInstant()),
                "Item Name", 1, OrderStatus.PENDING);
        actualOrder.toString();
        assertEquals("42", actualOrder.getItemId());
        assertEquals("Item Name", actualOrder.getItemName());
        assertEquals("42", actualOrder.getOrderId());
        assertEquals(1, actualOrder.getOrderQuantity());
        assertEquals(OrderStatus.PENDING, actualOrder.getStatus());
    }


    @Test
    void testConstructor2() {
        Order actualOrder = new Order("42", "Item Name", 1, OrderStatus.PENDING);

        assertEquals("42", actualOrder.getItemId());
        assertEquals(OrderStatus.PENDING, actualOrder.getStatus());
        assertEquals(1, actualOrder.getOrderQuantity());
        assertEquals("Item Name", actualOrder.getItemName());
    }


    @Test
    void testConstructor3() {
        Order actualOrder = new Order("42", "Item Name", 1, OrderStatus.DECLINED);

        assertEquals("42", actualOrder.getItemId());
        assertEquals(OrderStatus.DECLINED, actualOrder.getStatus());
        assertEquals(1, actualOrder.getOrderQuantity());
        assertEquals("Item Name", actualOrder.getItemName());
    }


    @Test
    void testConstructor4() {
        Order actualOrder = new Order("42", "Item Name", 1, OrderStatus.APPROVED);

        assertEquals("42", actualOrder.getItemId());
        assertEquals(OrderStatus.APPROVED, actualOrder.getStatus());
        assertEquals(1, actualOrder.getOrderQuantity());
        assertEquals("Item Name", actualOrder.getItemName());
    }
}

