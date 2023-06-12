package za.ac.cput.service;

import za.ac.cput.domain.Seat;


import java.util.Set;

public interface SeatService {
    Seat create(Seat seat);
    Seat read(String id);
    Set<Seat> getAll();
}
