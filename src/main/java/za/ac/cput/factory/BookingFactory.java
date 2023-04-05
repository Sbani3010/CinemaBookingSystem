package za.ac.cput.factory;

import za.ac.cput.domain.*;
import za.ac.cput.util.Helper;

public class BookingFactory {

    public static Booking createBooking(ShowTime showTime, Seat[] seats, CinemaHall cinemaHall, User user, Snack[] snacks) {
        if (Helper.isNullOrEmpty(showTime))
            return null;
        return new Booking.Builder().setId(Helper.generateId())
                .setSnacks(snacks)
                .setShowTime(showTime)
                .setSeats(seats)
                .setCinemaHall(cinemaHall)
                .setUser(user)
                .build();
    }
}
