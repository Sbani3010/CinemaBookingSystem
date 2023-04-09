/* MovieRepository.java
 Entity for the Movie
 Author: Sbani Sithole (219446563)
*/
package za.ac.cput.util;

import za.ac.cput.domain.*;
import za.ac.cput.factory.*;
import java.util.Date;


public class TestObjects {
    public static Movie movie = MovieFactory.createMovie("Spider Man", "xxxxxxxx xxxxxx xxxxxxx", "Action", " Joaquim Dos Santos", 2);
    public static User user = UserFactory.createUser("Meshack", "Kennedy", "kennedyM@gmail.com", "Sbani3038");
    public static Address address = AddressFactory.createAddress("65 caledon street", "cape town", "south africa", 7530);
    public static Seat seat= SeatFactory.createSeat(1,4);
    public static Rating rating= za.ac.cput.Factory.RatingFactory.createRating(4,movie,user);
    public static Snack snack=SnackFactory.createSnack(50.0,"popcorn");
    private static Seat[] seats={seat};
    private static Snack[] snacks={snack};
    public static ShowTime showTime=ShowTimeFactory.createShowTime(movie,new Date());
    public static CinemaHall cinemaHall=CinemaHallFactory.createCinemaHall("nu metro",100,10,seats,showTime,address);
    public static Booking booking=BookingFactory.createBooking(showTime, seats,cinemaHall,user,snacks);
    public static Ticket ticket= za.ac.cput.Factory.TicketFactory.createTicket(200,seat,user,movie);
    public static ProofOfPayment payment=ProofOfPaymentFactory.createProofOfPayment(user,200,new Date());
    public static Invoice invoice=InvoiceFactory.createInvoice(booking);
}
