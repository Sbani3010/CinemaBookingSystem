package za.ac.cput.Factory;
/*
RatingFactory.java
Rating factory class.
Luphiwe Sikupela(216060133)
03/April/2023
 */

import za.ac.cput.domain.Movie;
import za.ac.cput.domain.Rating;
import za.ac.cput.domain.User;
import za.ac.cput.util.Helper;

public class RatingFactory {
    public static Rating createRating(int score, Movie movie, User user){
        if(Helper.isNullOrEmpty(movie)|| Helper.isNullOrEmpty(score))
            return null;
        return new Rating.Builder().setMovie(movie)
                .setScore(score)
                .setUser(user)
                .setId(Helper.generateId()).build();

    }
}
