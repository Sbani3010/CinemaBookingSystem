/*
 * ShowTimeRepositoryTest.java
 * Test for ShowTime repository
 * Author: Sinethemba Sithela 219112940
 * Date: 09/04/2023
 */
package za.ac.cput.repository;

import org.junit.jupiter.api.Test;
import za.ac.cput.repository.impl.ShowTimeRepository;
import za.ac.cput.util.TestObjects;

import static org.junit.jupiter.api.Assertions.*;

class ShowTimeRepositoryTest {
    @Test
    void createTest(){
        assertEquals(true, ShowTimeRepository.getRepository().create(TestObjects.showTime));
    }
    @Test
    void readTest(){
        createTest();
        assertNotNull(ShowTimeRepository.getRepository().read(TestObjects.showTime.getId()));
    }

    @Test
    void updateTest(){
        createTest();
        assertEquals(true, ShowTimeRepository.getRepository().update(TestObjects.showTime));
    }

    @Test
    void deleteTest(){
        createTest();
        assertEquals(true, ShowTimeRepository.getRepository().delete(TestObjects.showTime.getId()));
    }

}