package Security.service;

import Security.model.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.List;

public interface UserService {
    void addUser(User user);

    void updateUser(User user);

    void deleteUserById(Long id);

    User getUserById(Long id);

    User getUserByName(String username);

    List<User> getAllUsers();

    UserDetails loadUserByUsername(String s) throws UsernameNotFoundException;

}
