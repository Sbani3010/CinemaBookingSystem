/* * AddressServiceImpl.java
* * Implementation
* * Author: Sinethemba Sithela 219112940
* * Date: 11/06/2023
* */
package za.ac.cput.service.impl;

import za.ac.cput.domain.Address;
import za.ac.cput.repository.impl.AddressRepository;
import za.ac.cput.service.AddressService;

import java.util.Set;

public class AddressServiceImpl implements AddressService {
    private static AddressServiceImpl addressService = null;
    private AddressRepository repository = null;

    private AddressServiceImpl(){
        repository = AddressRepository.getRepository();
    }

    public static AddressServiceImpl getAddressService() {
        if (addressService == null) {
            addressService = new AddressServiceImpl();
        }
        return addressService;
    }
    @Override
    public Address create(Address address){
        Address created = repository.create(address);
        return created;
    }

    @Override
    public Address read(String id){
        Address readAddress = repository.read(id);
        return readAddress;
    }

    @Override
    public Address update(Address address){
        return repository.update(address);
    }

    @Override
    public boolean delete(String id){
        boolean deleted = repository.delete(id);
        return deleted;
    }

    @Override
    public Set<Address> getAll(){
        return repository.getAll();
    }
}
