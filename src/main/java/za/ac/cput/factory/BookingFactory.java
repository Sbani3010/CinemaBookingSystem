package za.ac.cput.factory;
import za.ac.cput.domain.Booking;
import za.ac.cput.domain.Show;

import java.util.UUID;

public class BookingFactory {
    public static Booking createBooking(String dateMade, int seatNum) {
        UUID uuid = UUID.randomUUID();
        return new Booking.Builder().setBookingId(uuid.hashCode())
                .setDateMade(dateMade)
                .setSeatNum(seatNum)
                .build();
    }

    public static Booking createBooking(Booking booking) {
        UUID uuid = UUID.randomUUID();
        return new Booking.Builder()
                .setBookingId(uuid.hashCode())
                .setShowId(booking.getShowId())
                .setDateMade(booking.getDateMade())
                .setSeatNum(booking.getSeatNum())
                .build();
    }
}
