//package za.ac.cput.service.impl;
//
//import za.ac.cput.domain.Invoice;
//import za.ac.cput.domain.Rating;
//import za.ac.cput.repository.impl.RatingRepository;
//import za.ac.cput.service.InvoiceService;
//import za.ac.cput.service.RatingService;
//
//import java.util.Set;
//
//public class RatingServiceImpl implements RatingService {
//
//    private static RatingServiceImpl service = null;
//    private RatingRepository repository=null;
//
//    private RatingServiceImpl()  {
//        if (repository == null) {
//            repository =  RatingRepository.getRepository();
//        }
//
//    }
//    public static RatingServiceImpl getService() {
//        if (service == null) {
//            service = new RatingServiceImpl();
//        }
//        return service;
//    }
//
//    @Override
//    public Rating create(Rating rating) {
//        Rating created = repository.create(rating);
//        return created;
//    }
//
//    public Rating read(String id){
//        Rating readRating= repository.read(id);
//        return readRating;
//    }
//
//    public Rating update(Rating rating){
//        Rating updated = repository.update(rating);
//        return updated;
//    }
//
//    @Override
//    public boolean delete(String id)
//    {
//        boolean success = repository.delete(id);
//        return success;
//    }
//
//    @Override
//    public Set<Rating> getAll() {
//        return repository.getAll();
//    }
//
//    public static class InvoiceServiceImpl implements InvoiceService {
//        private static InvoiceServiceImpl service = null;
//        private InvoiceRepository repository = null;
//
//        private InvoiceServiceImpl(){
//            repository = InvoiceRepository.getRepository();
//        }
//
//        public static InvoiceServiceImpl getService(){
//            if (service == null){
//                service = new InvoiceServiceImpl();
//            }
//            return service;
//        }
//
//        @Override
//        public Invoice create(Invoice invoice){
//            Invoice created = repository.create(invoice);
//            return created;
//        }
//
//        @Override
//        public Invoice read(String id){
//            Invoice readInvoice = repository.read(id);
//            return readInvoice;
//        }
//        @Override
//        public Invoice update(Invoice invoice){
//            return repository.update(invoice);
//        }
//
//        @Override
//        public boolean delete(String id){
//            return repository.delete(id);
//        }
//
//        @Override
//        public Set<Invoice> getAll(){
//            return repository.getAll();
//        }
//    }
//}
//
