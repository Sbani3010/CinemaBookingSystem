/* IUserRepository.java
 * IRepository for User
 * Author: Lehlogonolo Rakgetse (22017954)
 * Date : 06 April 2023
 * */

package za.ac.cput.repository;

import za.ac.cput.domain.User;
import java.util.Set;

public interface IUserRepository extends IRepository<User, String>{
    Set<User> getAll();
}
