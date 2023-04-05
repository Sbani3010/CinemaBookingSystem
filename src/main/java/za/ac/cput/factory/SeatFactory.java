/*SeatFactory.java
 * Factory Class for Seat
 * Author: Lehlogonolo Rakgetse (22017954)
 * Date : 05 April 2023
 * */

package za.ac.cput.factory;

import za.ac.cput.domain.Seat;
import za.ac.cput.util.Helper;

public class SeatFactory {
    public static Seat createSeat (int row, int number){
        if (Helper.isNullOrEmpty(row) || Helper.isNullOrEmpty(number))
            return null;

        return new Seat.Builder().setId(Helper.generateId())
                .setRow(row)
                .setNumber(number)
                .build();
    }
}
