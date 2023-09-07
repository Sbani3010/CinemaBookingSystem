package za.ac.cput.factory;
import za.ac.cput.domain.Booking;
import za.ac.cput.domain.Show;

import java.util.Date;
import java.util.UUID;

public class BookingFactory {
    public static Booking createBooking(Date dateMade, int seatNum) {
        return new Booking.Builder()
                .setDateMade(dateMade)
                .setSeatNum(seatNum)
                .build();
    }

    public static Booking createBooking(Booking booking) {
        return new Booking.Builder()
                .setShowId(booking.getShowId())
                .setDateMade(booking.getDateMade())
                .setSeatNum(booking.getSeatNum())
                .build();
    }
}
