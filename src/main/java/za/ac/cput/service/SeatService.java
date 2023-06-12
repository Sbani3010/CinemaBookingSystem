package za.ac.cput.service;

import za.ac.cput.domain.Seat;

public interface SeatService {
    Seat create(Seat seat);
    Seat read(String id);
    boolean delete(String id);
}
