package za.ac.cput.domain;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class MovieRoom {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int roomNum;
    private boolean available;
    @OneToMany(mappedBy = "movieRoom", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Seat> seats=new ArrayList<>();
    @ManyToOne
    @JoinColumn(name = "cinema_id")
    private Cinema cinema;

    protected MovieRoom() {
    }

    private MovieRoom(Builder builder) {
        this.roomNum = builder.roomNum;
        this.available = builder.available;
        this.seats = builder.seats;
        this.cinema = builder.cinema;
    }

    public int getRoomNum() {
        return roomNum;
    }

    public boolean isAvailable() {
        return available;
    }

    public List<Seat> getSeats() {
        return seats;
    }

    public Cinema getCinema() {
        return cinema;
    }

    public static class Builder {
        private int roomNum;
        private boolean available;
        private List<Seat> seats;
        private Cinema cinema;

        public Builder setRoomNum(int roomNum) {
            this.roomNum = roomNum;
            return this;
        }

        public Builder setAvailable(boolean available) {
            this.available = available;
            return this;
        }

        public Builder setSeats(List<Seat> seats) {
            this.seats = seats;
            return this;
        }

        public Builder setCinema(Cinema cinema) {
            this.cinema = cinema;
            return this;
        }

        public Builder copy(MovieRoom movieRoom) {
            this.roomNum = movieRoom.roomNum;
            this.available = movieRoom.available;
            this.seats = movieRoom.seats;
            this.cinema = movieRoom.cinema;
            return this;
        }

        public MovieRoom build() {
            return new MovieRoom(this);
        }
    }
}
