package za.ac.cput.repository;
/*
RatingRepositoryTest.java
RatingRepositoryTest  class.
Luphiwe Sikupela(216060133)
06/April/2023
 */

import org.junit.jupiter.api.Test;
import za.ac.cput.repository.impl.RatingRepository;


import static org.junit.jupiter.api.Assertions.*;
import static za.ac.cput.util.TestObjects.*;

class RatingRepositoryTest {

    @Test
    void create_test() {
        assertEquals(true, RatingRepository.getRepository().create(rating));
        System.out.println("Test Created");
    }

    @Test
    void read_test() {
        create_test();
        assertNotNull(RatingRepository.getRepository().read(rating.getId()));
    }

    @Test
    void update_test() {
        create_test();
        assertEquals(true, RatingRepository.getRepository().update(rating));
    }

    @Test
    void delete_test() {
        create_test();
        assertEquals(true, RatingRepository.getRepository().delete(rating.getId()));
    }
}