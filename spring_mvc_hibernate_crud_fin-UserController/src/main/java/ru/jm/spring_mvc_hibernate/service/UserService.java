package ru.jm.spring_mvc_hibernate.service;

import ru.jm.spring_mvc_hibernate.entity.Role;
import ru.jm.spring_mvc_hibernate.entity.User;

import java.util.List;

public interface UserService {

    void addUser(User user);

    void updateUser(User user);

    void removeUserById(long id);

    User getUserById(long id);

    List<User> getAllUsers();

    User getUserByName(String username);
}
