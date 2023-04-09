/* MovieRepository.java
 Entity for the Movie
 Author: Sbani Sithole (219446563)
*/
package za.ac.cput.repository;

import org.junit.jupiter.api.Test;
import za.ac.cput.util.TestObjects;

import static org.junit.jupiter.api.Assertions.*;

class ProofOfPaymentRepositoryTest {
    @Test
    void create_test() {
        assertEquals(true, ProofOfPaymentRepository.getRepository().create(TestObjects.payment));
    }

    @Test
    void read_test() {
        create_test();
        assertNotNull(ProofOfPaymentRepository.getRepository().read(TestObjects.payment.getId()));
    }

    @Test
    void update_test() {
        assertEquals(false, ProofOfPaymentRepository.getRepository().update(TestObjects.payment));
    }

    @Test
    void delete_test() {
        create_test();
        assertEquals(true, ProofOfPaymentRepository.getRepository().delete(TestObjects.payment.getId()));
    }

}