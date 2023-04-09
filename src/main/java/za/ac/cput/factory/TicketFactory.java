package za.ac.cput.Factory;
/*
TicketFactory.java
Ticket factory class.
Luphiwe Sikupela(216060133)
03/April/2023
 */
import za.ac.cput.domain.Movie;
import za.ac.cput.domain.Ticket;
import za.ac.cput.domain.Seat;
import za.ac.cput.domain.User;
import za.ac.cput.util.Helper;

public class TicketFactory {
    public static Ticket createTicket(double price, Seat seat, User user, Movie movie){
        if(Helper.isNullOrEmpty(price) || Helper.isNullOrEmpty(seat))
            return null;
        return new Ticket.Builder().setPrice(price)
                .setSeat(seat)
                .setUser(user)
                .setMovie(movie)
                .setId(Helper.generateId()).build();
    }
}



