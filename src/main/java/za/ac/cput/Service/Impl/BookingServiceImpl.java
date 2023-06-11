package za.ac.cput.Service.Impl;

import za.ac.cput.Service.BookingService;
import za.ac.cput.domain.Booking;
import za.ac.cput.repository.BookingRepository;

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
    public Booking create(Booking booking) {
        Booking created=repository.create(booking);
        return created;
    }

    @Override
    public boolean update(Booking booking) {
        boolean updated= repository.update(booking);
        return updated;
    }

    @Override
    public Booking read(String id) {
        Booking readBooking= repository.read(id);
        return readBooking;
    }

    @Override
    public boolean delete(String id) {
        boolean success = repository.delete(id);
        return success;
    }

    @Override
    public Set<Booking> getAll() {
        return repository.getAll();
    }
}
