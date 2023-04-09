/*  Booking.java
 Author: Twala Nthabiseng Celesta(221361936)
 Date: 04 April 2023
*/
package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.util.TestObjects;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class SnackFactoryTest {
    @Test
    void test(){
        assertNotNull(TestObjects.snack);
    }

}