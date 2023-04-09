/*
 *IShowTimeRepository.java
 * Author: Sinethemba Sithela 219112940
 * 06/04/2023
 */
package za.ac.cput.repository;

import za.ac.cput.domain.ShowTime;

import java.util.Set;

public interface IShowTimeRepository extends IRepository <ShowTime,String> {
    Set<ShowTime> getAll();
}
