package za.ac.cput.service.impl;

import za.ac.cput.domain.Seat;
import za.ac.cput.domain.Snack;
import za.ac.cput.repository.impl.SeatRepository;
import za.ac.cput.service.SeatService;

import java.util.Set;

public class SeatServiceImpl implements SeatService {
    private static SeatServiceImpl seatService=null;
    private SeatRepository repository=null;
    private SeatServiceImpl(){
        if(repository==null)repository=SeatRepository.getRepository();
    }
    public static SeatServiceImpl getSeatService(){
        if(seatService==null) seatService=new SeatServiceImpl();
        return seatService;
    }

    @Override
    public Seat create(Seat seat) {
        return repository.create(seat);
    }

    @Override
    public Seat read(String seatId) {
        return repository.read(seatId);
    }


    @Override
    public Set<Seat> getAll() {
        return repository.getAll();
    }


}
