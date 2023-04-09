package za.ac.cput.repository;
/*
ITicketRepository.java
ITicketRepository  class.
Luphiwe Sikupela(216060133)
04/April/2023
 */

import za.ac.cput.domain.Ticket;

import java.util.Set;

public interface ITicketRepository extends IRepository<Ticket, String>{
    Set<Ticket>getAll();

}
