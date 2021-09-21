package ru.jm.spring_mvc_hibernate.DAO;

import ru.jm.spring_mvc_hibernate.entity.User;

import java.util.List;

public interface UserDAO {

    void addUser(User user);

    void updateUser(User user);

    void removeUserById(long id);

    User getUserById(long id);

    List<User> getAllUsers();

    User getUserByUsername(String username);
}
