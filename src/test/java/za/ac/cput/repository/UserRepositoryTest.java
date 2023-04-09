package za.ac.cput.repository;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.User;
import za.ac.cput.factory.UserFactory;

import static org.junit.jupiter.api.Assertions.*;
import static za.ac.cput.util.TestObjects.user;

class UserRepositoryTest {
    @Test
    void create_test() {
        assertEquals(true,UserRepository.getRepository().create(user));
    }
    @Test
    void read_test(){
        create_test();
        assertNotNull(UserRepository.getRepository().read(user.getId()));
        System.out.println(user);
    }

    @Test
    void update_test(){
        create_test();
        User user= UserFactory.createUser("Lehlogonolo","Rakgetse","lehlogonolorakgetse31@gmail.com","Lehl@123");
        assertEquals(false,UserRepository.getRepository().update(user));
        System.out.println(user);
    }
    @Test
    void delete_test(){
        create_test();
        assertEquals(true,UserRepository.getRepository().delete(user.getId()));
    }

}