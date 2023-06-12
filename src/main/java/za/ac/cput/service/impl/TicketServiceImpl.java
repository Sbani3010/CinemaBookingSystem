package za.ac.cput.service.impl;

import za.ac.cput.domain.Ticket;
import za.ac.cput.repository.impl.TicketRepository;
import za.ac.cput.service.TicketService;

import java.util.Set;

public class TicketServiceImpl implements TicketService {

    private static TicketServiceImpl service = null;
    private TicketRepository repository=null;

    private TicketServiceImpl()  {
        if (repository==null)repository= TicketRepository.getRepository();
    }
    public static TicketServiceImpl getService() {
        if (service == null) {
            service = new TicketServiceImpl();
        }
        return service;
    }


    @Override
    public Ticket create(Ticket ticket) {
        Ticket created = repository.create(ticket);
        return created;
    }

    @Override
    public Ticket read(String id) {
        Ticket readTicket= repository.read(id);
        return readTicket;
    }

    @Override
    public Ticket update(Ticket ticket) {
        Ticket updated = repository.update(ticket);
        return updated;
    }

    @Override
    public boolean delete(String id) {
        boolean success = repository.delete(id);
        return success;
    }

    @Override
    public Set<Ticket> getAll() {
        return repository.getAll();
    }
}
