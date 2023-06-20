package za.ac.cput.service;


import za.ac.cput.domain.CinemaHall;

import java.util.Set;

public interface CinemaHallService extends IService<CinemaHall,String> {
    Set<CinemaHall> getAll();
}
