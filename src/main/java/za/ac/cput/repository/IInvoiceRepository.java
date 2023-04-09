/*
 * IInvoiceRepository.java
 * Interface for invoice repository
 * Author: Sinethemba Sithela 219112940
 * Date: 04/04/2023
 */
package za.ac.cput.repository;

import za.ac.cput.domain.Invoice;

import java.util.Set;

public interface IInvoiceRepository extends IRepository<Invoice, String>{
    Set<Invoice> getAll();

}
