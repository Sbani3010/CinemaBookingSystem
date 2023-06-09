/*  Booking.java
 Entity for the Booking
 Author: Twala Nthabiseng Celesta(221361936)
 Date: 04 April 2023
*/
package za.ac.cput.repository.impl;

import za.ac.cput.domain.CinemaHall;
import za.ac.cput.repository.ICinemaHallRepository;
import za.ac.cput.util.Helper;

import java.util.HashSet;
import java.util.Set;

public class CinemaHallRepository implements ICinemaHallRepository {
    public static CinemaHallRepository repository=null;
    public Set<CinemaHall> cinemaHalls =null;
    private CinemaHallRepository() {
        cinemaHalls = new HashSet<CinemaHall>();
    }
    public static CinemaHallRepository getRepository() {
        if (Helper.isNullOrEmpty(repository))
            repository = new CinemaHallRepository();
        return repository;
    }
    @Override
    public Set<CinemaHall> getAll() {
        return cinemaHalls;
    }

    @Override
    public CinemaHall create(CinemaHall obj) {
        if (Helper.isNullOrEmpty(obj))
        return null;
        return cinemaHalls.add(obj)?obj:null;
    }

    @Override
    public CinemaHall read(String id) {
        if (Helper.isNullOrEmpty(id))
        return null;
        return cinemaHalls.stream().filter(e-> e.getId().equals(id)).findAny().orElse(null);
    }

    @Override
    public CinemaHall update(CinemaHall obj) {
        CinemaHall oldCinemaHall=read(obj.getId());
        if (Helper.isNullOrEmpty(oldCinemaHall))
        return null;
        cinemaHalls.remove(oldCinemaHall);
        return cinemaHalls.add(obj)?obj:null;
    }

    @Override
    public boolean delete(String id) {
      return cinemaHalls.remove(read(id));
    }
}
