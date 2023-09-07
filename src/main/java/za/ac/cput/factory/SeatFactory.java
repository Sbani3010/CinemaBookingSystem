package za.ac.cput.factory;

import za.ac.cput.domain.MovieRoom;
import za.ac.cput.domain.Seat;

public class SeatFactory {
    public static Seat createSeat(int seatNum, double price, boolean reserved, MovieRoom movieRoom) {

        return new Seat.Builder()
                .setSeatNum(seatNum)
                .setPrice(price)
                .setReserved(reserved)
                .setMovieRoom(movieRoom)
                .build();
    }
}
