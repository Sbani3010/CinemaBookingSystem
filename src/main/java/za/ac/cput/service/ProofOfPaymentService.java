package za.ac.cput.service;

import za.ac.cput.domain.ProofOfPayment;

import java.util.Set;

public interface ProofOfPaymentService extends IService<ProofOfPayment,String>{
    Set<ProofOfPayment> getAll();
}
