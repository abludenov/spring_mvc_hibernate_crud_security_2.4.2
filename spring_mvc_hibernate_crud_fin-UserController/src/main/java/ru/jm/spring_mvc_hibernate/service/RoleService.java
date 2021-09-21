package ru.jm.spring_mvc_hibernate.service;

import ru.jm.spring_mvc_hibernate.entity.Role;

import java.util.List;

public interface RoleService {

    void addRole(Role role);

    void updateRole(Role role);

    void removeRoleById(long id);

    List<Role> getAllRoles();

    Role getRoleByName(String name);
}
