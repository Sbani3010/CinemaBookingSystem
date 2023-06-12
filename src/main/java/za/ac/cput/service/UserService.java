package za.ac.cput.service;

import za.ac.cput.domain.User;

public interface UserService {
    User create(User user);
    User read(String id);
    boolean delete(String id);

}
