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
    private Snack[] snacks;

    private Booking(){}

    private Booking (Builder builder){
       this.id = builder.id;
       this.showTime = builder.showTime;
       this.seats = builder.seats;
       this.user = builder.user;
       this.cinemaHall = builder.cinemaHall;
       this.snacks = builder.snacks;
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

    public Snack[] getSnacks() {
        return snacks;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "id='" + id + '\'' +
                ", showTime=" + showTime +
                ", seats=" + Arrays.toString(seats) +
                ", user=" + user +
                ", cinemaHall=" + cinemaHall +
                ", snacks=" + Arrays.toString(snacks) +
                '}';
    }

    public static class Builder{
       private String id;
       private ShowTime showTime;
       private User user;
       private Seat[] seats;
       private CinemaHall cinemaHall;
       private Snack[] snacks;
        public Builder setId(String id){
           this.id=id;
           return this;
       }
        public Builder setSeats(Seat[] seats){
           this.seats= seats;
           return this;
       }
       public Builder setSnacks(Snack[] snacks){
            this.snacks=snacks;
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
           this.snacks = booking.snacks;
           this.showTime = booking.showTime;
           return this; }
       public Booking build(){
           return new Booking(this);
       }

   }

}
