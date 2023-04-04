/*
 * Invoice.java
 * Entity for invoice
 * Author: Sinethemba Sithela 219112940
 * Date: 04/04/2023
 */
package za.ac.cput.domain;

public class Invoice {
    private String id;
    private Booking booking;

    private Invoice(){

    }

    private Invoice(Builder builder){
        this.id = builder.id;
        this.booking = builder.booking;
    }

    public String getId(){
        return id;
    }

    public Booking getBooking(){
        return booking;
    }

    public static class Builder{
        private String id;
        private Booking booking;

        public Builder setId(String id){
            this.id = id;
            return this;
        }

        public Builder setBooking(Booking booking){
            this.booking = booking;
            return this;
        }

        public Invoice build(){
            return new Invoice(this);
        }
    }
}
