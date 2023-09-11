/*
 * IAddressService.java
 * This is a service for address entity
 * Author: Sinethemba Sithela (219112940)
 * Date: 26/08/2023
 */

package za.ac.cput.service;

import za.ac.cput.domain.Address;

import java.util.List;
import java.util.Set;

public interface IAddressService extends IService<Address, String>{
    List<Address> getAll();

}
