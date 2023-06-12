package za.ac.cput.service.impl;

import za.ac.cput.domain.User;
import za.ac.cput.repository.impl.UserRepository;
import za.ac.cput.service.UserService;

public class UserServiceImpl implements UserService {
    private static UserServiceImpl userService=null;
    private UserRepository repository=null;
    private  UserServiceImpl(){
        if (repository==null)repository=UserRepository.getRepository();
    }
    public static UserServiceImpl getUserService(){
        if (userService==null)userService=new UserServiceImpl();
        return userService;
    }

    @Override
    public User create(User user) {
        return repository.create(user);
    }

    @Override
    public User read(String id) {
        return repository.read(id);
    }

    @Override
    public boolean delete(String id) {
        return repository.delete(id);
    }
}
