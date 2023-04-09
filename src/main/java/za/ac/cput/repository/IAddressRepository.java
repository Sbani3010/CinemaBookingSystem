/*
 * IAddressRepository.java
 * Interface for Address Repository
 * Author: Sinethemba Sithela 219112940
 * Date: 04/04/2023
 */
package za.ac.cput.repository;

import za.ac.cput.domain.Address;

import java.util.Set;

public interface IAddressRepository extends IRepository<Address, String> {
    Set<Address> getAll();
}
