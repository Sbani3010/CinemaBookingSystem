package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.util.TestObjects;

import static org.junit.jupiter.api.Assertions.*;

class UserFactoryTest {
    @Test
    void test()
    {
        assertNotNull(TestObjects.user);
    }
}