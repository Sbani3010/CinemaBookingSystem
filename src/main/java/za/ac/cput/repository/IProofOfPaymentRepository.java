/* IRepository.java
 IRepository interface
 Author: Sbani Sithole (219446563)
*/
package za.ac.cput.repository;

import za.ac.cput.domain.ProofOfPayment;

import java.util.Set;

public interface IProofOfPaymentRepository extends IRepository<ProofOfPayment,String>{
    Set<ProofOfPayment> getAll();
}
