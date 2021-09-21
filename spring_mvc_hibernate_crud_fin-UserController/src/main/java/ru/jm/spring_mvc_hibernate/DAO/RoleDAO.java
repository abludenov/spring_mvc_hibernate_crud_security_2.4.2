package ru.jm.spring_mvc_hibernate.DAO;

import ru.jm.spring_mvc_hibernate.entity.Role;

import java.util.List;

public interface RoleDAO {

    void addRole(Role role);

    void updateRole(Role role);

    void removeRoleById(long id);

    List<Role> getAllRoles();

    Role getRoleByName(String name);
}
