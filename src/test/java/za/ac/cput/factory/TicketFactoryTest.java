package za.ac.cput.factory;
/*
TicketFactoryTest.java
TicketFactoryTest class.
Luphiwe Sikupela(216060133)
06/April/2023
 */

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;
import static za.ac.cput.util.TestObjects.ticket;
import static za.ac.cput.util.TestObjects.user;

class TicketFactoryTest {

    @Test
    void test(){
        assertNotNull(ticket);
}

    @Test
    public void testObjectEquality() {
        assertEquals(ticket, ticket);
    }
    @Test
     void testObjectIdentity() {

        assertSame(ticket, ticket);
        System.out.println(ticket);
    }
   
    @Test
    public void failingTest() {
        assertEquals(ticket,ticket);
        fail("ticket unavailable");
    }

   
    @Test
    public void timeOutTest() {
        assertTimeout(Duration.ofSeconds(1), () -> {
            testObjectEquality();
        });
    }

   @Disabled("Test Disabled")
    @Test
    public void disabledTest() {
       assertSame(ticket,ticket);
      System.out.println(ticket);
    }
}

