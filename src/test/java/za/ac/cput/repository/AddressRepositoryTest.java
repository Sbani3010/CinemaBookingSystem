/*
 * AddressRepositoryTest.java
 * Test for address repository
 * Author: Sinethemba Sithela 219112940
 * Date: 09/04/2023
 */
package za.ac.cput.repository;

import org.junit.jupiter.api.Test;
import za.ac.cput.util.TestObjects;

import static org.junit.jupiter.api.Assertions.*;

class AddressRepositoryTest {
    @Test
    void createTest(){
        assertEquals(true, AddressRepository.getRepository().create(TestObjects.address));
    }
    @Test
    void readTest(){
        createTest();
        assertNotNull(AddressRepository.getRepository().read(TestObjects.address.getId()));
    }

    @Test
    void updateTest(){
        createTest();
        assertEquals(true, AddressRepository.getRepository().update(TestObjects.address));
    }

    @Test
    void deleteTest(){
        createTest();
        assertEquals(true, AddressRepository.getRepository().delete(TestObjects.address.getId()));
    }
}