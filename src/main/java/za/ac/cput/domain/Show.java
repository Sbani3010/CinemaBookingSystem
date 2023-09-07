package za.ac.cput.domain;
import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Show {
    @Id
    @GeneratedValue
    private Integer showId;

    private int roomNum;
    @OneToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    private Movie movieId;
    private Date dateCreated;
    private String startTime;
    private String endTime;

    protected Show(){}
    private Show(Builder builder){
        this.showId = builder.showId;
        this.roomNum = builder.roomNum;
        this.movieId = builder.movieId;
        this.dateCreated = builder.dateCreated;
        this.startTime = builder.startTime;
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

    public Date getDateCreated() {
        return dateCreated;
    }

    public String getStartTime() {
        return startTime;
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
        private Date dateCreated;
        private String startTime;

        public Builder setShowId(Integer showId) {
            this.showId = showId;
            return this;
        }
        public Builder setRoomNum(int roomNum) {
            this.roomNum = roomNum;
            return this;
        }
        public Builder setMovieId(Movie movieId) {
            this.movieId = movieId;
            return this;
        }
        public Builder setDateCreated(Date dateCreated) {
            this.dateCreated = dateCreated;
            return this;
        }
        public Builder setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public Builder copy(Show show) {
            this.showId = show.showId;
            this.roomNum = show.roomNum;
            this.movieId = show.movieId;
            this.dateCreated= show.dateCreated;
            this.startTime = show.startTime;
            return this;
        }
        public Show build(){
            return new Show(this);
        }
    }
}
