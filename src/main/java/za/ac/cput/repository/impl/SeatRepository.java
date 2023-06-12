/* SeatRepository.java
 * Repository for a Seat
 * Author: Lehlogonolo Rakgetse (22017954)
 * Date : 06 April 2023
 * */

package za.ac.cput.repository.impl;

import za.ac.cput.domain.Seat;
import za.ac.cput.repository.ISeatRepository;
import za.ac.cput.util.Helper;
import java.util.HashSet;
import java.util.Set;

public class SeatRepository implements ISeatRepository {
    public static SeatRepository repository = null;
    public Set<Seat> seats = null;

    public SeatRepository() {
        seats = new HashSet<Seat>();
    }

    public static SeatRepository getRepository() {
        if (Helper.isNullOrEmpty(repository))
            repository = new SeatRepository();
        return repository;
    }


    @Override
    public Seat create(Seat seat) {
        if (Helper.isNullOrEmpty(seat))
            return null;
        return seats.add(seat)?seat:null;
    }

    @Override
    public Seat read(String id) {
        if (Helper.isNullOrEmpty(id))
            return null;
        return seats.stream().filter(e -> e.getId().equals(id)).findAny().orElse(null);
    }

    @Override
    public Seat update(Seat seat) {

        if (Helper.isNullOrEmpty(read(seat.getId())))
            return null;
        seats.remove(read(seat.getId()));
        return seats.add(seat)?seat:null;
    }

    @Override
    public boolean delete(String id) {
        return seats.remove(read(id));
    }

    @Override
    public Set<Seat> getAll() {
        return seats;
    }
}
