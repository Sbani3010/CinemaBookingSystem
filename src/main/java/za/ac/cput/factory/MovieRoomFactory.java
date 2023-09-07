package za.ac.cput.factory;

import za.ac.cput.domain.Cinema;
import za.ac.cput.domain.MovieRoom;
import za.ac.cput.domain.Seat;

import java.util.List;

public class MovieRoomFactory {
    public static MovieRoom createRoom(boolean available, List<Seat> seats, Cinema cinema) {
        return new MovieRoom.Builder()

                .setAvailable(available)
                .setSeats(seats)
                .setCinema(cinema)
                .build();
    }
    public static MovieRoom createRoom(int id,boolean available, List<Seat> seats, Cinema cinema) {
        return new MovieRoom.Builder()
                .setRoomNum(id)
                .setAvailable(available)
                .setSeats(seats)
                .setCinema(cinema)
                .build();
    }
}
