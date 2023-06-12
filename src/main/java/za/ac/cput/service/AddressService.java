/* * AddressService.java
* * Address service
* * Author: Sinethemba Sithela 219112940
* * Date: 11/06/2023
* */
package za.ac.cput.service;

import za.ac.cput.domain.Address;

import java.util.Set;

public interface AddressService extends IService<Address,String>{
    Set<Address> getAll();
}
