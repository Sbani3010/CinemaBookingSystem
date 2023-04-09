package za.ac.cput.factory;
/*
RatingFactoryTest.java
RatingFactoryTest  class.
Luphiwe Sikupela(216060133)
06/April/2023
 */

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;
import static za.ac.cput.util.TestObjects.rating;


class RatingFactoryTest {
    @Test
    void test(){
        assertNotNull(rating);
    }

    @Test
    public void testObjectEquality() {
        assertEquals(rating, rating);
    }
    @Test
    void testObjectIdentity() {

        assertSame(rating, rating);
        System.out.println(rating);
    }

    @Test
    public void failingTest() {
        assertEquals(rating,rating);
        fail("ticket unavailable");
    }


    @Test
    public void timeOutTest() {
        assertTimeout(Duration.ofSeconds(1), () -> testObjectEquality());
    }

    @Disabled("Test Disabled")
    @Test
    public void disabledTest() {
        assertSame(rating,rating);
        System.out.println(rating);
    }

}