package za.ac.cput.repository;

import za.ac.cput.domain.Invoice;

import java.util.Set;

public interface IInvoiceRepository extends IRepository<Invoice, String>{
    Set<Invoice> getAll();

}
