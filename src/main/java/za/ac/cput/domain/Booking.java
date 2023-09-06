package za.ac.cput.domain;
import jakarta.persistence.*;

@Entity
public class Booking {
    @Id
    private Integer bookingId;
    @OneToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    private Show showId;
    private String dateMade;
    private int seatNum;

    protected Booking(){}
    private Booking(Booking.Builder builder){
        this.bookingId = builder.bookingId;
        this.showId = builder.showId;
        this.dateMade = builder.dateMade;
        this.seatNum = builder.seatNum;
    }

    public Integer getBookingId() {
        return bookingId;
    }

    public Show getShowId() {
        return showId;
    }

    public String getDateMade() {
        return dateMade;
    }

    public int getSeatNum() {
        return seatNum;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "bookingId='" + bookingId + '\'' +
                ", showId='" + showId + '\'' +
                ", dateMade='" + dateMade + '\'' +
                ", seatNum=" + seatNum +
                '}';
    }

    public static class Builder {
        private Integer bookingId;
        private Show showId;
        private String dateMade;
        private int seatNum;

        public Booking.Builder setBookingId(Integer bookingId) {
            this.bookingId = bookingId;
            return this;
        }

        public Booking.Builder setShowId(Show showId) {
            this.showId = showId;
            return this;
        }

        public Booking.Builder setDateMade(String dateMade) {
            this.dateMade = dateMade;
            return this;
        }
        public Booking.Builder setSeatNum(int seatNum) {
            this.seatNum = seatNum;
            return this;
        }

        public Booking.Builder copy(Booking booking) {
            this.bookingId = booking.bookingId;
            this.showId = booking.showId;
            this.dateMade = booking.dateMade;
            this.seatNum= booking.seatNum;
            return this;
        }
        public Booking build(){
            return new Booking(this);
        }
    }
}
