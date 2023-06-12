/* * InvoiceService.java
* * Invoice service
* * Author: Sinethemba Sithela 219112940
* * Date: 11/06/2023
* */
package za.ac.cput.service;

import za.ac.cput.domain.Invoice;

import java.util.Set;

public interface InvoiceService extends IService<Invoice, String>{
    Set<Invoice> getAll();
}
