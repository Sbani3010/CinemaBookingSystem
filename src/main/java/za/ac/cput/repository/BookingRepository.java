/*  Booking.java
 Entity for the Booking
 Author: Twala Nthabiseng Celesta(221361936)
 Date: 04 April 2023
*/
package za.ac.cput.repository;

import za.ac.cput.domain.Booking;
import za.ac.cput.util.Helper;

import java.util.HashSet;
import java.util.Set;

public class BookingRepository implements IBookingRepository {
    private static BookingRepository repository = null;
    public Set<Booking> bookings = null;

    public static BookingRepository getRepository() {
        if (Helper.isNullOrEmpty(repository))
            repository = new BookingRepository();
        return repository;
    }

    private BookingRepository() {
        bookings = new HashSet<Booking>();
    }

    @Override
    public Set<Booking> getAll() {
        return bookings;
    }

    @Override
    public boolean create(Booking obj) {
        if (Helper.isNullOrEmpty(obj))
            return false;
        return bookings.add(obj);
    }

    @Override
    public Booking read(String id) {
        if(Helper.isNullOrEmpty(id))
        return null;
       return bookings.stream().filter(e->e.getId().equals(id)).findAny().orElse(null);

    }

    @Override
    public boolean update(Booking obj) {
        Booking oldBooking = read(obj.getId());
        if (Helper.isNullOrEmpty(oldBooking))
        return false;
        bookings.remove(oldBooking);
        return bookings.add(obj);
    }

    @Override
    public boolean delete(String id) {

        return bookings.remove(read(id));
    }
}
