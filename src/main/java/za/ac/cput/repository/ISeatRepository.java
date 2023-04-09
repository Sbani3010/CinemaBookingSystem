/*ISeatRepository.java
 * IRepository For the Seat
 * Author: Lehlogonolo Rakgetse (22017954)
 * Date : 06 April 2023
 * */

package za.ac.cput.repository;

import za.ac.cput.domain.Seat;

import java.util.Set;


public interface ISeatRepository extends IRepository<Seat, String>{
    Set<Seat> getAll();
}
