/* MovieRepository.java
 Entity for the Movie
 Author: Sbani Sithole (219446563)
*/

package za.ac.cput.repository;

import za.ac.cput.domain.Movie;
import za.ac.cput.util.Helper;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MovieRepository implements IMovieRepository {
    private static MovieRepository repository = null;
    private Set<Movie> movies = null;

    private MovieRepository() {
        movies = new HashSet<Movie>();
    }

    public static MovieRepository getRepository() {
        if (Helper.isNullOrEmpty(repository))
            repository = new MovieRepository();
        return repository;
    }


    @Override
    public boolean create(Movie movie) {
        if (Helper.isNullOrEmpty(movie))
            return false;
        return movies.add(movie);
    }

    @Override
    public Movie read(String id) {
        if (Helper.isNullOrEmpty(id))
            return null;
        return movies.stream().filter(movie -> movie.getId().equals(id)).findAny().orElse(null);
    }

    @Override
    public boolean update(Movie movie) {

        Movie oldMovie = read(movie.getId());
        if (Helper.isNullOrEmpty(oldMovie))
            return false;
        movies.remove(oldMovie);
        return movies.add(movie);
    }

    @Override
    public boolean delete(String id) {
        Movie movie = read(id);
        if (Helper.isNullOrEmpty(movie))
            return false;
        return movies.remove(movie);
    }

    @Override
    public List<Movie> getAll() {
        return null;
    }

}
