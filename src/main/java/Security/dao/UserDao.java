package Security.dao;

import Security.model.User;

import java.util.List;

public interface UserDao {

    void addUser(User user);

    void updateUser(User user);

    void deleteUserById(Long id);

    User getUserById(Long id);

    User getUserByName(String username);

    List<User> getAllUsers();

}
