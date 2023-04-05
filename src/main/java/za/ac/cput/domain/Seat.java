/*Seat.java
* Entity For the Seat
* Author: Lehlogonolo Rakgetse (22017954)
* Date : 04 April 2023
* */

package za.ac.cput.domain;

public class Seat {
    private String id;
    private int row;
    private int number;
    private Seat(){}

    private Seat(Builder builder){
        this.id= builder.id;
        this.row= builder.row;
        this.number= builder.number;
    }

    public String getId() {
        return id;
    }

    public int getRow() {
        return row;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "Seat{" +
                "id='" + id + '\'' +
                ", row=" + row +
                ", number=" + number +
                '}';
    }

    public static class Builder{
        private String id;
        private int row;
        private int number;

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setRow(int row) {
            this.row = row;
            return this;
        }

        public Builder setNumber(int number) {
            this.number = number;
            return this;
        }

        public Builder copy(Seat seat){
            this.id = seat.id;
            this.row = seat.row;
            this.number = seat.number;
            return this;
        }

        public Seat build(){
            return new Seat(this);
        }
    }
}
