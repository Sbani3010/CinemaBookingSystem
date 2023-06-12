/*UserRepository.java
 * Repository For the User
 * Author: Lehlogonolo Rakgetse (22017954)
 * Date : 06 April 2023
 * */

package za.ac.cput.repository.impl;

import za.ac.cput.domain.User;
import za.ac.cput.repository.IUserRepository;
import za.ac.cput.util.Helper;

import java.util.HashSet;
import java.util.Set;

public class UserRepository implements IUserRepository {
    private static UserRepository repository = null;
    private Set<User> users = null;

    private UserRepository() {
        users = new HashSet<User>();
    }

    public static UserRepository getRepository() {
        if (Helper.isNullOrEmpty(repository)) {
            repository = new UserRepository();
        }
        return repository;
    }

    @Override
    public User create(User user) {
        if (Helper.isNullOrEmpty(user))
            return null;
        return users.add(user)?user:null;
    }

    @Override
    public User read(String id) {
        if (Helper.isNullOrEmpty(id))
            return null;
        return users.stream().filter(user -> user.getId().equals(id)).findAny().orElse(null);
    }

    @Override
    public User update(User user) {
        User oldUser = read(user.getId());
        if (Helper.isNullOrEmpty(oldUser))
            return null;
        users.remove(oldUser);
        return users.add(user)?user:null;
    }

    @Override
    public boolean delete(String id) {
        User user = read(id);
        if (Helper.isNullOrEmpty(user))
            return false;
        return users.remove(user);
    }

    @Override
    public Set<User> getAll() {
        return null;
    }
}
