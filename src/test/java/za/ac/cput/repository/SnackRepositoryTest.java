package za.ac.cput.repository;

import org.junit.jupiter.api.Test;
import za.ac.cput.util.TestObjects;

import static org.junit.jupiter.api.Assertions.*;

class SnackRepositoryTest {
    @Test
    void create_test(){
        assertEquals(true,SnackRepository.getRepository().create(TestObjects.snack));
    }
    @Test
    void read_test(){
        create_test();
        assertNotNull(SnackRepository.getRepository().read(TestObjects.snack.getId()));
    }
    @Test
    void update_test(){
        create_test();
        assertEquals(true,SnackRepository.getRepository().update(TestObjects.snack));
    }
    @Test
    void delete_test(){
        create_test();
        assertEquals(true,SnackRepository.getRepository().delete(TestObjects.snack.getId()));
    }


}