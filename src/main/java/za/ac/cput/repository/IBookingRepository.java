/*  Booking.java
 Entity for the Booking
 Author: Twala Nthabiseng Celesta(221361936)
 Date: 04 April 2023
*/
package za.ac.cput.repository;

import za.ac.cput.domain.Booking;

import java.util.Set;

public interface IBookingRepository extends IRepository<Booking,String>{

    Set<Booking> getAll();
}
