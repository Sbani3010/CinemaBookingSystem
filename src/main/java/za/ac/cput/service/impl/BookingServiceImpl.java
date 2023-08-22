package za.ac.cput.service.impl;

import za.ac.cput.service.BookingService;
import za.ac.cput.domain.Booking;
import za.ac.cput.repository.impl.BookingRepository;

import java.util.Set;

public class BookingServiceImpl implements BookingService {
    private static BookingServiceImpl service= null;
    private BookingRepository repository=null;

    private BookingServiceImpl(){
        repository=BookingRepository.getRepository();
    }

    public static BookingServiceImpl getService(){
        if (service==null){
            service=new BookingServiceImpl();
        }
 return service;
    }
    @Override
    public Set<Booking> getAll() {
        return repository.getAll();
    }

    @Override
    public Booking create(Booking booking) {
        return repository.create(booking);
    }

    @Override
    public Booking read(String s) {
        return repository.read(s);
    }

    @Override
    public Booking update(Booking booking) {
        return repository.update(booking);
    }
    @Override
    public boolean delete(String s) {
        return repository.delete(s);
    }
}
