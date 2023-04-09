/*ShowTimeFactory.java
 *Factory class  For the ShowTime
 * Author: Lehlogonolo Rakgetse (22017954)
 * Date : 05 April 2023
 * */

package za.ac.cput.factory;

import za.ac.cput.domain.Movie;
import za.ac.cput.domain.ShowTime;
import za.ac.cput.util.Helper;

import java.util.Date;

public class ShowTimeFactory {
    public static ShowTime createShowTime (Movie movie, Date date){
        if (Helper.isNullOrEmpty(movie) || Helper.isNullOrEmpty(date))
            return null;

        return new ShowTime.Builder().setId(Helper.generateId())
                .setMovie(movie)
                .setDate(date)
                .build();
    }
}
