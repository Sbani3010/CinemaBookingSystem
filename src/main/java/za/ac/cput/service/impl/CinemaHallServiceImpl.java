package za.ac.cput.service.impl;

import za.ac.cput.service.CinemaHallService;
import za.ac.cput.domain.CinemaHall;
import za.ac.cput.repository.impl.CinemaHallRepository;

import java.util.Set;

public class CinemaHallServiceImpl implements CinemaHallService {
 private  static CinemaHallServiceImpl service = null;

 private CinemaHallRepository repository =null;

 private CinemaHallServiceImpl(){
     repository= CinemaHallRepository.getRepository();
 }
  public static CinemaHallServiceImpl getService(){
     if(service==null){
         service=new CinemaHallServiceImpl();
     }

     return service;
  }
    @Override
    public CinemaHall create(CinemaHall cinemaHall) {
        CinemaHall created=repository.create(cinemaHall);
        return created;
    }

    @Override
    public CinemaHall update(CinemaHall cinemaHall) {
        return repository.update(cinemaHall);
    }

    @Override
    public CinemaHall read(String id) {
        CinemaHall readCinemaHall= repository.read(id);
        return readCinemaHall;
    }

    @Override
    public boolean delete(String id) {
        boolean success = repository.delete(id);
        return success;
    }

    @Override
    public Set<CinemaHall> getAll() {
        return repository.getAll();
    }
}
