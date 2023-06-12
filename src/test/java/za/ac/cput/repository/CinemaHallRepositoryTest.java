/*  Booking.java
 Author: Twala Nthabiseng Celesta(221361936)
 Date: 04 April 2023
*/
package za.ac.cput.repository;

import org.junit.jupiter.api.Test;
import za.ac.cput.repository.impl.CinemaHallRepository;
import za.ac.cput.util.TestObjects;

import static org.junit.jupiter.api.Assertions.*;

class CinemaHallRepositoryTest {
@Test
    void creat_test(){
    assertEquals(true, CinemaHallRepository.getRepository().create(TestObjects.cinemaHall));
}
@Test
    void read_test(){
    creat_test();
    assertNotNull(CinemaHallRepository.getRepository().read(TestObjects.cinemaHall.getId()));
}
@Test
    void update_date(){
    creat_test();
    assertEquals(true,CinemaHallRepository.getRepository().update(TestObjects.cinemaHall));
}
@Test
    void delete_test(){
    creat_test();
    assertEquals(true,CinemaHallRepository.getRepository().delete(TestObjects.cinemaHall.getId()));
}
}