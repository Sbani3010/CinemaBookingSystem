package za.ac.cput.service;


import za.ac.cput.domain.CinemaHall;

import java.util.Set;

public interface CinemaHallService {

    CinemaHall create(CinemaHall cinemaHall);
    CinemaHall update(CinemaHall  cinemaHall);

    CinemaHall read(String id);
    boolean delete(String id);

    Set<CinemaHall> getAll();
}
