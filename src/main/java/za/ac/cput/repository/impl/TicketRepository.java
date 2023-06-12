package za.ac.cput.repository.impl;
/*
TicketRepository.java
TicketRepository  class.
Luphiwe Sikupela(216060133)
04/April/2023
 */

import za.ac.cput.domain.Ticket;
import za.ac.cput.repository.ITicketRepository;
import za.ac.cput.util.Helper;

import java.util.HashSet;
import java.util.Set;

public class TicketRepository implements ITicketRepository {

    private static TicketRepository repository = null;
    private Set<Ticket> tickets;

    private TicketRepository() {
        tickets = new HashSet<>();
    }

    public static TicketRepository getRepository() {
        if (Helper.isNullOrEmpty(repository))
            repository = new TicketRepository();
        return repository;
    }


    @Override
    public Ticket create(Ticket obj) {
        if (Helper.isNullOrEmpty(obj))
            return null;
        return tickets.add(obj)?obj:null;
    }

    @Override
    public Ticket read(String id) {
        if (Helper.isNullOrEmpty(id))
            return null;
        return tickets.stream().filter(e -> e.getId().equals(id)).findAny().orElse(null);
    }


    @Override
    public Ticket update(Ticket obj) {
        Ticket ticket1 = read(obj.getId());
        if (Helper.isNullOrEmpty(ticket1))
            return null;
        tickets.remove(ticket1);
        return tickets.add(obj)?obj:null;
    }

    @Override
    public boolean delete(String id) {
        if (Helper.isNullOrEmpty(id))
            return false;
        return tickets.remove(read(id));
    }

    @Override
    public Set<Ticket> getAll() {
        return tickets;
    }
}
