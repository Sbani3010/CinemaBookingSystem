/* * InvoiceServiceImpl.java
* * Implementation
* * Author: Sinethemba Sithela 219112940
* * Date: 11/06/2023
* */
package za.ac.cput.services.impl;

import za.ac.cput.domain.Address;
import za.ac.cput.domain.Invoice;
import za.ac.cput.repository.InvoiceRepository;
import za.ac.cput.services.InvoiceService;

import java.util.Set;

public class InvoiceServiceImpl implements InvoiceService {
    private static InvoiceServiceImpl service = null;
    private InvoiceRepository repository = null;

    private InvoiceServiceImpl(){
        repository = InvoiceRepository.getRepository();
    }

    public static InvoiceServiceImpl getService(){
        if (service == null){
            service = new InvoiceServiceImpl();
        }
        return service;
    }

    @Override
    public Invoice create(Invoice invoice){
        Invoice created = repository.create(invoice);
        return created;
    }

    @Override
    public Invoice read(String id){
        Invoice readInvoice = repository.read(id);
        return readInvoice;
    }
    @Override
    public Invoice update(Invoice invoice){
        return repository.update(invoice);
    }

    @Override
    public boolean delete(String id){
        return repository.delete(id);
    }

    @Override
    public Set<Invoice> getAll(){
        return repository.getAll();
    }
}
