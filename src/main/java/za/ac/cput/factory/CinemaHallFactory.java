package za.ac.cput.factory;

import za.ac.cput.domain.Address;
import za.ac.cput.domain.CinemaHall;
import za.ac.cput.domain.Seat;
import za.ac.cput.domain.ShowTime;
import za.ac.cput.util.Helper;

public class CinemaHallFactory {

    public static CinemaHall createCinemaHall(String name, int capacity, int rows, Seat[] seats, ShowTime showTime, Address address){
        if(Helper.isNullOrEmpty(showTime))
            return null;
        return new CinemaHall.Builder().setId(Helper.generateId())
                .setName(name)
                .setCapacity(capacity)
                .setRows(rows)
                .setSeats(seats)
                .setShowTime(showTime)
                .setAddress(address)
                .build();
    }
}
