package za.ac.cput.factory;

import za.ac.cput.domain.Booking;
import za.ac.cput.domain.Invoice;
import za.ac.cput.util.Helper;

public class InvoiceFactory {
    public static Invoice createInvoice(Booking booking){
        if (Helper.isNullOrEmpty(booking))
            return null;
        return new Invoice.Builder().setId(Helper.generateId())
                .setBooking(booking)
                .build();
    }
}
