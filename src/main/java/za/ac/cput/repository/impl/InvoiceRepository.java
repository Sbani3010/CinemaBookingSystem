/*
 * InvoiceRepository.java
 * Repository for Invoice
 * Author: Sinethemba Sithela 219112940
 * Date: 04/04/2023
 */
package za.ac.cput.repository.impl;

import za.ac.cput.domain.Invoice;
import za.ac.cput.repository.IInvoiceRepository;
import za.ac.cput.util.Helper;

import java.util.HashSet;
import java.util.Set;

public class InvoiceRepository implements IInvoiceRepository {
    private static InvoiceRepository repository = null;
    private Set<Invoice> invoices = null;

    private InvoiceRepository(){
        invoices = new HashSet<Invoice>();
    }

    public static InvoiceRepository getRepository(){
        if (Helper.isNullOrEmpty(repository))
            repository = new InvoiceRepository();
        return repository;
    }

    @Override
    public Set<Invoice> getAll(){
        return invoices;
    }

    @Override
    public Invoice create (Invoice obj) {
        if (Helper.isNullOrEmpty(obj))
            return null;
        return invoices.add(obj)?obj:null;
    }
    @Override
    public Invoice read (String id){
        if (Helper.isNullOrEmpty(id))
            return null;
        return invoices.stream().filter(e -> e.getId().equals(id)).findAny().orElse(null);
    }

    @Override
    public Invoice update (Invoice obj){
        Invoice invoice1 = read(obj.getId());
        if (Helper.isNullOrEmpty(invoice1))
            return null;
        invoices.remove(invoice1);
        return invoices.add(obj)?obj:null;
    }

    @Override
    public boolean delete(String id){
        if (Helper.isNullOrEmpty(id))
            return false;
        return invoices.remove(read(id));
    }
}
