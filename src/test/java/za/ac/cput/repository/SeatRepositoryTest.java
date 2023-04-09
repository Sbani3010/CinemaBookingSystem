package za.ac.cput.repository;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Seat;
import za.ac.cput.factory.SeatFactory;
import za.ac.cput.util.TestObjects;

import static org.junit.jupiter.api.Assertions.*;
import static za.ac.cput.util.TestObjects.seat;

class SeatRepositoryTest {
    @Test
    void create_test() {
        assertEquals(true, SeatRepository.getRepository().create(seat));
    }

    @Test
    void read_test() {
        create_test();
        assertNotNull(SeatRepository.getRepository().read(seat.getId()));
        System.out.println(seat);
    }

    @Test
    void update_test() {
        create_test();
        Seat seat2 = SeatFactory.createSeat(7,9);
        assertEquals(false, SeatRepository.getRepository().update(seat2));
        System.out.println(seat2);
    }

    @Test
    void delete_test() {
        create_test();
        assertEquals(true, SeatRepository.getRepository().delete(seat.getId()));
    }

}