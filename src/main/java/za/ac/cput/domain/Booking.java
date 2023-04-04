/*  Booking.java
 Entity for the Booking
 Author: Twala Nthabiseng Celesta(221361936)
 Date: 03 April 2023
*/

package za.ac.cput.domain;

import java.util.Arrays;

public class Booking {
    private String id;
    private ShowTime showTime;
    private Seat[] seats;
    private User user;
    private CinemaHall cinemaHall;
    private Payment payment;

    private Booking(){}

    public Booking (Builder builder){
       this.id = builder.id;
       this.showTime = builder.showTime;
       this.seats = builder.seats;
       this.user = builder.user;
       this.cinemaHall = builder.cinemaHall;
       this.payment = builder.payment;
    }

    public String getId() {
        return id;
    }

    public ShowTime getShowTime() {
        return showTime;
    }

    public Seat[] getSeats() {
        return seats;
    }

    public User getUser() {
        return user;
    }

    public CinemaHall getCinemaHall() {
        return cinemaHall;
    }

    public Payment getPayment() {
        return payment;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "id='" + id + '\'' +
                ", showTime=" + showTime +
                ", seats=" + Arrays.toString(seats) +
                ", user=" + user +
                ", cinemaHall=" + cinemaHall +
                ", payment=" + payment +
                '}';
    }
   public static class Builder{
       private String id;
       private ShowTime showTime;
       private User user;
       private Seat[] seats;
       private CinemaHall cinemaHall;
       private Payment payment;

       public Builder setPayment(Payment payment){
           this.payment= payment;
           return this;
       }
        public Builder setId(String id){
           this.id=id;
           return this;
       }
        public Builder setSeats(Seat[] seats){
           this.seats= seats;
           return this;
       }
        public Builder setCinemaHall(CinemaHall cinemaHall){
           this.cinemaHall= cinemaHall;
           return this;
       }
        public Builder setUser(User user){
           this.user= user;
           return this;
       }
        public Builder setShowTime(ShowTime showTime){
           this.showTime= showTime;
           return this;
       }
       public Builder copy(Booking booking){
           this.id = booking.id;
           this.user = booking.user;
           this.seats = booking.seats;
           this.cinemaHall = booking.cinemaHall;
           this.payment = booking.payment;
           this.showTime = booking.showTime;
           return this; }
       public Booking build(){
           return new Booking(this);
       }

   }

}
