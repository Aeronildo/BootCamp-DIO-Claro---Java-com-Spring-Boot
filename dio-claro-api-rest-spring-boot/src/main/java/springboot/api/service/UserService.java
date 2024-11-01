package springboot.api.service;

import java.util.List;
import springboot.api.model.User;

public interface UserService {

    public User findById(Long id);
    public User createUser(User user);
    List<User> findAll();
    void deleteUserById(Long id);
}
