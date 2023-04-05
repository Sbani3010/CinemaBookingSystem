package za.ac.cput.repository;

import za.ac.cput.domain.Invoice;
import za.ac.cput.util.Helper;

import java.util.HashSet;
import java.util.Set;

public class InvoiceRepository implements IInvoiceRepository{
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
    public boolean create (Invoice obj) {
        if (Helper.isNullOrEmpty(obj))
            return false;
        return invoices.add(obj);
    }
    @Override
    public Invoice read (String id){
        if (Helper.isNullOrEmpty(id))
            return null;
        return invoices.stream().filter(e -> e.getId().equals(id)).findAny().orElse(null);
    }

    @Override
    public boolean update (Invoice obj){
        Invoice invoice1 = read(obj.getId());
        if (Helper.isNullOrEmpty(invoice1))
            return false;
        invoices.remove(invoice1);
        return invoices.add(obj);
    }

    @Override
    public boolean delete(String id){
        if (Helper.isNullOrEmpty(id))
            return false;
        return invoices.remove(read(id));
    }
}
