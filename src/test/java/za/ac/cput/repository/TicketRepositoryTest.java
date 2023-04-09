package za.ac.cput.repository;
/*
TicketRepositoryTest.java
TicketRepositoryTest  class.
Luphiwe Sikupela(216060133)
06/April/2023
 */
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import static za.ac.cput.util.TestObjects.ticket;

class TicketRepositoryTest {

    @Test
    void create_test() {
        assertEquals(true, TicketRepository.getRepository().create(ticket));
       //System.out.println(ticket);
    }

    @Test
    void read_test() {
        create_test();
        assertNotNull(TicketRepository.getRepository().read(ticket.getId()));
    }

    @Test
    void update_test() {
        create_test();
        assertEquals(true, TicketRepository.getRepository().update(ticket));
    }

    @Test
    void delete_test() {
        create_test();
        assertEquals(true, TicketRepository.getRepository().delete(ticket.getId()));
        System.out.println(ticket);
    }
}