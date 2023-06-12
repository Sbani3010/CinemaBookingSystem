/*
 * InvoiceRepositoryTest.java
 * Test for Invoice repository
 * Author: Sinethemba Sithela 219112940
 * Date: 09/04/2023
 */
package za.ac.cput.repository;

import org.junit.jupiter.api.Test;
import za.ac.cput.repository.impl.InvoiceRepository;
import za.ac.cput.util.TestObjects;

import static org.junit.jupiter.api.Assertions.*;

class InvoiceRepositoryTest {
    @Test
    void createTest(){
        assertEquals(true, InvoiceRepository.getRepository().create(TestObjects.invoice));
    }
    @Test
    void readTest(){
        createTest();
        assertNotNull(InvoiceRepository.getRepository().read(TestObjects.invoice.getId()));
    }

    @Test
    void updateTest(){
        createTest();
        assertEquals(true, InvoiceRepository.getRepository().update(TestObjects.invoice));
    }

    @Test
    void deleteTest(){
        createTest();
        assertEquals(true, InvoiceRepository.getRepository().delete(TestObjects.address.getId()));
    }

}