/*  CinemaHall.java
 Entity for the CinemaHall
 Author: Twala Nthabiseng Celesta(221361936)
 Date: 03 April 2023
*/


package za.ac.cput.domain;

import java.util.Arrays;

public class CinemaHall {
    private String id;
    private String name;
    private int capacity;
    private int rows;
    private Seat[] seats;
    private ShowTime showTime;
    private Address address;

    private CinemaHall(){}

    private CinemaHall(Builder builder){
        this.id= builder.id;
        this.name= builder.name;
        this.capacity= builder.capacity;
        this.rows=builder.rows;
        this.seats= builder.seats;
        this.showTime= builder.showTime;
        this.address= builder.address;

    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getRows() {
        return rows;
    }

    public Seat[] getSeats() {
        return seats;
    }

    public ShowTime getShowTime() {
        return showTime;
    }

    public Address getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "CinemaHall{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", capacity=" + capacity +
                ", rows=" + rows +
                ", seats=" + Arrays.toString(seats) +
                ", showTime=" + showTime +
                ", address=" + address +
                '}';
    }
    public static class Builder{
        private String id;
        private String name;
        private int capacity;
        private  int rows;
        private Seat[] seats;
        private ShowTime showTime;
        private Address address;

        public Builder setId(String id){
            this.id = id;
            return this;
        } public Builder setName(String name){
            this.name = name;
            return this;
        } public Builder setCapacity(int capacity){
            this.capacity = capacity;
            return this;
        } public Builder setRows(int  rows){
            this.rows = rows;
            return this;
        } public Builder setSeats(Seat[] seats){
            this.seats= seats;
            return this;
        } public Builder setShowTime(ShowTime showTime){
            this.showTime = showTime;
            return this;
        } public Builder setAddress(Address address){
            this.address = address;
            return this;
        }
        public Builder copy(CinemaHall cinemaHall){
          this.id = cinemaHall.id;
          this.name = cinemaHall.name;
          this.capacity = cinemaHall.capacity;
          this.rows= cinemaHall.rows;
          this.seats= cinemaHall.seats;
          this.showTime = cinemaHall.showTime;
          this.address = cinemaHall.address;
         return this;
        }
        public CinemaHall build(){
            return new CinemaHall(this);
        }
    }
}

