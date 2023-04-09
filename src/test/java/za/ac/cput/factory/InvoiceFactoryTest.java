/*
 * InvoiceFactoryTest.java
 * Test for Invoice factory
 * Author: Sinethemba Sithela 219112940
 * Date: 09/04/2023
 */
package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.util.TestObjects;

import static org.junit.jupiter.api.Assertions.*;

class InvoiceFactoryTest {

    @Test
    void test(){
        assertNotNull(TestObjects.invoice);
    }

}