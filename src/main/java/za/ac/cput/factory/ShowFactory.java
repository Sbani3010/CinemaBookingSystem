package za.ac.cput.factory;
import za.ac.cput.domain.Movie;
import za.ac.cput.domain.Show;
import za.ac.cput.util.Helper;

import java.util.UUID;

public class ShowFactory {
    public static Show createShow(int roomNum, String dateCreated, String startTime, String endTime) {
        if (Helper.isNullOrEmpty(dateCreated) || Helper.isNullOrEmpty(startTime) || Helper.isNullOrEmpty(endTime))
            return null;
        UUID uuid = UUID.randomUUID();
        return new Show.Builder().setShowId(uuid.hashCode())
                .setRoomNum(roomNum)
                .setDateCreated(dateCreated)
                .setStartTime(startTime)
                .setEndTime(endTime)
                .build();
    }

    public static Show createShow(Show show) {
        UUID uuid = UUID.randomUUID();
        return new Show.Builder()
                .setShowId(uuid.hashCode())
                .setRoomNum(show.getRoomNum())
                .setMovieId(show.getMovieId())
                .setDateCreated(show.getDateCreated())
                .setStartTime(show.getStartTime())
                .setEndTime(show.getEndTime())
                .build();
    }
}
