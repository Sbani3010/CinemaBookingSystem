/* IRepository.java
 IRepository interface
 Author: Sbani Sithole (219446563)
*/
package za.ac.cput.repository;

import za.ac.cput.domain.ProofOfPayment;
import za.ac.cput.util.Helper;

import java.util.HashSet;
import java.util.Set;

public class ProofOfPaymentRepository implements IProofOfPaymentRepository {
    private static ProofOfPaymentRepository repository = null;
    private Set<ProofOfPayment> proofOfPayments = null;

    private ProofOfPaymentRepository() {
        proofOfPayments = new HashSet<>();
    }

    public static ProofOfPaymentRepository getRepository() {
        if (Helper.isNullOrEmpty(repository))
            repository = new ProofOfPaymentRepository();

        return repository;
    }

    @Override
    public Set<ProofOfPayment> getAll() {
        return proofOfPayments;
    }

    @Override
    public boolean create(ProofOfPayment obj) {
        if (Helper.isNullOrEmpty(obj))
            return false;
        return proofOfPayments.add(obj);
    }

    @Override
    public ProofOfPayment read(String id) {
        if (Helper.isNullOrEmpty(id))
            return null;
        return proofOfPayments.stream().filter(e -> e.getId().equals(id)).findAny().orElse(null);
    }

    @Override
    public boolean update(ProofOfPayment obj) {
        ProofOfPayment oldPayment = read(obj.getId());
        if (Helper.isNullOrEmpty(oldPayment))
            return false;
        proofOfPayments.remove(oldPayment);
        return proofOfPayments.add(obj);
    }

    @Override
    public boolean delete(String id) {
        return proofOfPayments.remove(read(id));
    }
}
