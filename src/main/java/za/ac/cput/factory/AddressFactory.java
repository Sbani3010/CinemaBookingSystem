package za.ac.cput.factory;

import za.ac.cput.domain.Address;
import za.ac.cput.util.Helper;

public class AddressFactory {
    public static Address createAddress(String street, String city, String country, int zipCode){
        if (Helper.isNullOrEmpty(zipCode) || Helper.isNullOrEmpty(city) || Helper.isNullOrEmpty(country))
            return null;
        return new Address.Builder().setId(Helper.generateId())
                .setStreet(street)
                .setCity(city)
                .setCountry(country)
                .setZipCode(zipCode)
                .build();
    }
}
