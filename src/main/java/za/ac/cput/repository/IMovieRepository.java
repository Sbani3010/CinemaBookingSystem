/* IMovieRepository.java
 Entity for the Movie
 Author: Sbani Sithole (219446563)
*/
package za.ac.cput.repository;

import za.ac.cput.domain.Movie;

import java.util.List;
import java.util.Set;

public interface IMovieRepository extends IRepository<Movie,String>{
    Set<Movie> getAll();
}
