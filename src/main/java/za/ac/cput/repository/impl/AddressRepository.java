/*
 * AddressRepository.java
 * Repository for Address
 * Author: Sinethemba Sithela 219112940
 * Date: 04/04/2023
 */
package za.ac.cput.repository.impl;

import za.ac.cput.domain.Address;
import za.ac.cput.repository.IAddressRepository;
import za.ac.cput.util.Helper;

import java.util.HashSet;
import java.util.Set;

public class AddressRepository implements IAddressRepository {
    private static AddressRepository repository = null;
    private static Set<Address> addresses = null;

    private AddressRepository(){
        addresses = new HashSet<Address>();
    }

    public static AddressRepository getRepository(){
        if (Helper.isNullOrEmpty(repository))
            repository = new AddressRepository();
        return repository;
    }

    @Override
    public Address create (Address address){
        if (Helper.isNullOrEmpty(address))
            return null;
        return addresses.add(address)?address:null;
    }

    @Override
    public Address read(String id) {
        if (Helper.isNullOrEmpty(id))
            return null;
        return addresses.stream().filter(e -> e.getId().equals(id)).findAny().orElse(null);
    }

    @Override
    public Address update(Address address) {
        Address address1 = read(address.getId());
        addresses.remove(address1);
        return addresses.add(address)?address:null;
    }

    @Override
    public boolean delete(String id) {
        if (Helper.isNullOrEmpty(id))
            return false;
        return addresses.remove(read(id));
    }

    public Set<Address> getAll(){
        return addresses;
    }
}
