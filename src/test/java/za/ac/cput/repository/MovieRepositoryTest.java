/* MovieRepository.java
 Entity for the Movie
 Author: Sbani Sithole (219446563)
*/
package za.ac.cput.repository;

import org.junit.jupiter.api.Test;
import za.ac.cput.util.TestObjects;

import static org.junit.jupiter.api.Assertions.*;

class MovieRepositoryTest {
    @Test
    void create_test(){
        assertEquals(true,MovieRepository.getRepository().create(TestObjects.movie));
    }

    @Test
    void read_test(){
        create_test();
        assertNotNull(MovieRepository.getRepository().read(TestObjects.movie.getId()));
    }

    @Test
    void update_test(){
        create_test();
        assertEquals(true,MovieRepository.getRepository().update(TestObjects.movie));
    }

    @Test
    void delete_test(){
        create_test();
        assertEquals(true,MovieRepository.getRepository().delete(TestObjects.movie.getId()));
    }
}