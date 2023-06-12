/*  Booking.java
 Author: Twala Nthabiseng Celesta(221361936)
 Date: 04 April 2023
*/
package za.ac.cput.repository;

import org.junit.jupiter.api.Test;
import za.ac.cput.repository.impl.BookingRepository;
import za.ac.cput.util.TestObjects;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class BookingRepositoryTest {
    @Test
    void creat_test(){
        assertEquals(true, BookingRepository.getRepository().create(TestObjects.booking));
    }
    @Test
    void read_test(){
        creat_test();
        assertNotNull(BookingRepository.getRepository().read(TestObjects.booking.getId()));
    }
    @Test
    void update_test(){
        creat_test();
        assertEquals(true,BookingRepository.getRepository().update(TestObjects.booking));
    }
    @Test
    void delete_test(){
        creat_test();
        assertEquals(true,BookingRepository.getRepository().delete(TestObjects.booking.getId()));
    }

}