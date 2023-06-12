package za.ac.cput.service;



import za.ac.cput.domain.Ticket;

import java.util.Set;

public interface TicketService {

    Ticket create(Ticket ticket);

    Ticket read(String id);
    Ticket update(Ticket ticket);
    boolean delete(String id);
    Set<Ticket> getAll();
}

