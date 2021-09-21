package ru.jm.spring_mvc_hibernate.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.jm.spring_mvc_hibernate.DAO.UserDAO;
import ru.jm.spring_mvc_hibernate.entity.Role;
import ru.jm.spring_mvc_hibernate.entity.User;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    final UserDAO userDAO;

    @Autowired
    public UserServiceImpl(final UserDAO userDAO) {
        this.userDAO = userDAO;
    }


    @Override
    public void addUser(User user) {
        userDAO.addUser(user);
    }

    @Override
    public void updateUser(User user) {
        userDAO.updateUser(user);
    }

    @Override
    public void removeUserById(long id) {
        userDAO.removeUserById(id);
    }

    @Override
    public User getUserById(long id) {
        return userDAO.getUserById(id);
    }

    @Override
    public List<User> getAllUsers() {
        return userDAO.getAllUsers();
    }

    @Override
    public User getUserByName(String username) {
        return userDAO.getUserByUsername(username);
    }
}
