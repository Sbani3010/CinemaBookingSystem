/* MovieFactory.java
 Entity for the Movie
 Author: Sbani Sithole (219446563)
*/
package za.ac.cput.factory;

import za.ac.cput.domain.Movie;
import za.ac.cput.util.Helper;

public class MovieFactory {
    public static Movie createMovie(String title, String description, String genre, String director, double length) {
        if (Helper.isNullOrEmpty(title) || Helper.isNullOrEmpty(description) || Helper.isNullOrEmpty(director))
            return null;
        return new Movie.Builder().setTitle(title)
                .setDescription(description)
                .setGenre(genre)
                .setDirector(director)
                .setLength(length)
                .setId(Helper.generateId()).build();
    }
}
