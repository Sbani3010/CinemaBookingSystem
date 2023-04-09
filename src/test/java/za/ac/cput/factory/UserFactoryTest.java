/*UserFactoryTest.java
 * Test For the UserFactory
 * Author: Lehlogonolo Rakgetse (22017954)
 * Date : 09 April 2023
 * */

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