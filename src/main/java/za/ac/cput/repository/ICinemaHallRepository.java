/*  Booking.java
 Entity for the Booking
 Author: Twala Nthabiseng Celesta(221361936)
 Date: 04 April 2023
*/
package za.ac.cput.repository;

import za.ac.cput.domain.CinemaHall;

import java.util.Set;

public interface ICinemaHallRepository extends IRepository<CinemaHall,String>{
    Set<CinemaHall> getAll();
}
