package za.ac.cput.domain;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Seat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int seatNum;
    private boolean isReserved;
    private double price;
    @ManyToOne
//    @JoinColumn(name = "roomNum")
    private MovieRoom movieRoom;



    protected Seat() {
    }

    public Seat(Builder builder) {
        this.seatNum= builder.seatNum;
        this.isReserved= builder.isReserved;
        this.price= builder.price;
        this.movieRoom=builder.movieRoom;
    }

    public int getSeatNum() {
        return seatNum;
    }

    public boolean isReserved() {
        return isReserved;
    }

    public double getPrice() {
        return price;
    }

    public MovieRoom getMovieRoom() {
        return movieRoom;
    }

    public static class Builder{
        private int seatNum;
        private boolean isReserved;
        private double price;
        private MovieRoom movieRoom;

        public Builder setSeatNum(int seatNum) {
            this.seatNum = seatNum;
            return this;
        }

        public Builder setReserved(boolean reserved) {
            isReserved = reserved;
            return this;
        }

        public Builder setPrice(double price) {
            this.price = price;
            return this;
        }

        public Builder setMovieRoom(MovieRoom movieRoom) {
            this.movieRoom = movieRoom;
            return this;
        }
        public Builder copy(Seat seat){
            this.seatNum=seat.seatNum;
            this.price=seat.price;
            this.isReserved=seat.isReserved;
            this.movieRoom=seat.movieRoom;
            return this;
        }
        public Seat build(){
            return new Seat(this);
        }
    }
}
