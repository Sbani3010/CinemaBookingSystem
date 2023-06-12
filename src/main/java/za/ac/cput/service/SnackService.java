package za.ac.cput.service;

import za.ac.cput.domain.Snack;
import za.ac.cput.domain.Ticket;

import java.util.Set;

public interface SnackService {
    Snack create(Snack snack);
    Snack read(String id);
    Set<Snack> getAll();
    boolean delete(String id);
}
