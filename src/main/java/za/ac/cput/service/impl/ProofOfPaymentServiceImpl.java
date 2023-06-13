package za.ac.cput.service.impl;


import za.ac.cput.domain.ProofOfPayment;
import za.ac.cput.repository.impl.ProofOfPaymentRepository;
import za.ac.cput.service.ProofOfPaymentService;

import java.util.Set;

public class ProofOfPaymentServiceImpl implements ProofOfPaymentService {
    private static ProofOfPaymentServiceImpl proofOfPaymentService = null;
    private ProofOfPaymentRepository repository=null;

    private ProofOfPaymentServiceImpl(){
        if(repository==null)repository=ProofOfPaymentRepository.getRepository();
    }
    public static ProofOfPaymentServiceImpl getMovieService(){
        if(proofOfPaymentService==null) proofOfPaymentService=new ProofOfPaymentServiceImpl();
        return proofOfPaymentService;
    }
    @Override
    public ProofOfPayment create(ProofOfPayment proofOfPayment) {
        return repository.create(proofOfPayment);
    }
    @Override
    public ProofOfPayment read(String s) {
        return repository.read(s);
    }
    @Override
    public ProofOfPayment update(ProofOfPayment proofOfPayment) {
        return repository.update(proofOfPayment);
    }
    @Override
    public boolean delete(String s) {
        return repository.delete(s);
    }
    @Override
    public Set<ProofOfPayment> getAll() {
        return repository.getAll();
    }

}
