package za.ac.cput.service.impl;

import za.ac.cput.domain.Snack;
import za.ac.cput.repository.impl.SnackRepository;
import za.ac.cput.service.SnackService;

import java.util.Set;

public class SnackServiceImpl implements SnackService {
    private static SnackServiceImpl snackService=null;
    private SnackRepository repository=null;
    private SnackServiceImpl(){
        if(repository==null)repository=SnackRepository.getRepository();
    }
    public static SnackServiceImpl getSnackService(){
        if(snackService==null) snackService=new SnackServiceImpl();
        return snackService;
    }

    @Override
    public Snack create(Snack snack) {
        return repository.create(snack);
    }

    @Override
    public Snack read(String snackId) {
        return repository.read(snackId);
    }

    @Override
    public Set<Snack> getAll() {
        return repository.getAll();
    }

    @Override
    public boolean delete(String snackId) {
        return repository.delete(snackId);
    }


}
