package za.ac.cput.service.impl;

import za.ac.cput.domain.ShowTime;
import za.ac.cput.repository.impl.ShowTimeRepository;
import za.ac.cput.service.ShowTimeService;

import java.util.Set;

public class ShowTimeServiceImpl implements ShowTimeService {
    private static ShowTimeServiceImpl showTimeService = null;
    private ShowTimeRepository repository=null;

    private ShowTimeServiceImpl(){
        if(repository==null)repository = ShowTimeRepository.getRepository();
    }
    public static ShowTimeServiceImpl getShowTimeService(){
        if(showTimeService==null) showTimeService=new ShowTimeServiceImpl();
        return showTimeService;
    }
    @Override
    public ShowTime create(ShowTime showTime) {
        return repository.create(showTime);
    }
    @Override
    public ShowTime read(String s) {
        return repository.read(s);
    }
    @Override
    public ShowTime update(ShowTime showTime) {
        return repository.update(showTime);
    }
    @Override
    public boolean delete(String s) {
        return repository.delete(s);
    }
    public Set<ShowTime> getAll() {
        return repository.getAll();
    }
}
