package za.ac.cput.factory;
import za.ac.cput.domain.Show;
import java.util.Date;


public class ShowFactory {
    public static Show createShow(int roomNum, Date dateCreated, String startTime) {
        return new Show.Builder()
                .setRoomNum(roomNum)
                .setDateCreated(dateCreated)
                .setStartTime(startTime)
                .build();
    }

    public static Show createShow(Show show) {
        return new Show.Builder()
                .setRoomNum(show.getRoomNum())
                .setMovieId(show.getMovieId())
                .setDateCreated(show.getDateCreated())
                .setStartTime(show.getStartTime())
                .build();
    }
}
