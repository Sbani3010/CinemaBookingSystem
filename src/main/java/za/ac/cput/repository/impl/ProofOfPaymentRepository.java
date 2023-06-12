/* IRepository.java
 IRepository interface
 Author: Sbani Sithole (219446563)
*/
package za.ac.cput.repository.impl;

import za.ac.cput.domain.ProofOfPayment;
import za.ac.cput.repository.IProofOfPaymentRepository;
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
    public ProofOfPayment create(ProofOfPayment obj) {
        if (Helper.isNullOrEmpty(obj))
            return null;
        return proofOfPayments.add(obj)?obj:null;
    }

    @Override
    public ProofOfPayment read(String id) {
        if (Helper.isNullOrEmpty(id))
            return null;
        return proofOfPayments.stream().filter(e -> e.getId().equals(id)).findAny().orElse(null);
    }

    @Override
    public ProofOfPayment update(ProofOfPayment obj) {
        ProofOfPayment oldPayment = read(obj.getId());
        if (Helper.isNullOrEmpty(oldPayment))
            return null;
        proofOfPayments.remove(oldPayment);
        return proofOfPayments.add(obj)?obj:null;
    }

    @Override
    public boolean delete(String id) {
        return proofOfPayments.remove(read(id));
    }
}
