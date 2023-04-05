/*UserFactory.java
 * Factory class  For the User
 * Author: Lehlogonolo Rakgetse (22017954)
 * Date : 05 April 2023
 * */

package za.ac.cput.factory;

import za.ac.cput.domain.User;
import za.ac.cput.util.Helper;

public class UserFactory {
   public static User createUser(String firstName, String lastName, String email, String password){
       if (Helper.isNullOrEmpty(firstName) || Helper.isNullOrEmpty(lastName))
            return null;

       String userId = Helper.generateId();

       if (!Helper.validateEmail(email)){
           return null;
       }

       return new User.Builder().setfName(firstName)
               .setlName(lastName)
               .setId(userId)
               .setEmail(email)
               .setPassword(password)
               .build();
   }
}
