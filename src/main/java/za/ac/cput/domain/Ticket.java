package za.ac.cput.domain;
/*
Ticket.java
Ticket pojo class.
Luphiwe Sikupela(216060133)
02/April/2023
 */
public class Ticket {

    private String id;
    private double price;
    private Seat seat;
    private User user;
    private Movie movie;

    private Ticket() {
    }
    public Ticket (Builder builder){
        this.id=builder.id;
        this.price=builder.price;
        this.seat=builder.seat;
        this.user=builder.user;
        this.movie=builder.movie;
    }

    public String getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }

    public Seat getSeat() {
        return seat;
    }

    public User getUser() {
        return user;
    }

    public Movie getMovie() {
        return movie;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "id='" + id + '\'' +
                ", price=" + price +
                ", seat=" + seat +
                ", user=" + user +
                ", movie=" + movie +
                '}';
    }

    public static class Builder{

        private String id;
        private double price;
        private Seat seat;
        private User user;
        private Movie movie;

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setPrice(double price) {
            this.price = price;
            return this;
        }

        public Builder setSeat(Seat seat) {
            this.seat = seat;
            return this;
        }

        public Builder setUser(User user) {
            this.user = user;
            return this;
        }

        public Builder setMovie(Movie movie) {
            this.movie = movie;
            return this;
        }
        public Builder copy(Ticket ticket){
            this.id=ticket.id;
            this.price=ticket.price;
            this.seat= ticket.seat;
            this.user= ticket.user;
            this.movie= ticket.movie;
            return this;
        }
        public Ticket build(){
            return new Ticket(this);
        }

    }
}


