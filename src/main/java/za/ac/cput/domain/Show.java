package za.ac.cput.domain;
import jakarta.persistence.*;
@Entity
public class Show {
    @Id
    private Integer showId;

    private int roomNum;
    @OneToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    private Movie movieId;
    private String dateCreated;
    private String startTime;
    private String endTime;

    protected Show(){}
    private Show(Show.Builder builder){
        this.showId = builder.showId;
        this.roomNum = builder.roomNum;
        this.movieId = builder.movieId;
        this.dateCreated = builder.dateCreated;
        this.startTime = builder.startTime;
        this.endTime = builder.endTime;
    }

    public int getShowId() {
        return showId;
    }

    public int getRoomNum() {
        return roomNum;
    }

    public Movie getMovieId() {
        return movieId;
    }

    public String getDateCreated() {
        return dateCreated;
    }

    public String getStartTime() {
        return startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    @Override
    public String toString() {
        return "Show{" +
                "showId='" + showId + '\'' +
                ", roomNum=" + roomNum +
                ", movieId='" + movieId + '\'' +
                ", dateCreated='" + dateCreated + '\'' +
                ", startTime='" + startTime + '\'' +
                ", endTime='" + endTime + '\'' +
                '}';
    }

    public static class Builder {
        private Integer showId;
        private int roomNum;
        private Movie movieId;
        private String dateCreated;
        private String startTime;
        private String endTime;

        public Show.Builder setShowId(Integer showId) {
            this.showId = showId;
            return this;
        }
        public Show.Builder setRoomNum(int roomNum) {
            this.roomNum = roomNum;
            return this;
        }
        public Show.Builder setMovieId(Movie movieId) {
            this.movieId = movieId;
            return this;
        }
        public Show.Builder setDateCreated(String dateCreated) {
            this.dateCreated = dateCreated;
            return this;
        }
        public Show.Builder setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public Show.Builder setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public Show.Builder copy(Show show) {
            this.showId = show.showId;
            this.roomNum = show.roomNum;
            this.movieId = show.movieId;
            this.dateCreated= show.dateCreated;
            this.startTime = show.startTime;
            this.endTime = show.endTime;
            return this;
        }
        public Show build(){
            return new Show(this);
        }
    }
}
