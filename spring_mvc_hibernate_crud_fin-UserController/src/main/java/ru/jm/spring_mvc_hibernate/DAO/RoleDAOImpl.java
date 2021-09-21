package ru.jm.spring_mvc_hibernate.DAO;

import org.springframework.stereotype.Repository;
import ru.jm.spring_mvc_hibernate.entity.Role;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class RoleDAOImpl implements RoleDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void addRole(Role role) {
        entityManager.persist(role);
    }

    @Override
    public void updateRole(Role role) {
        entityManager.merge(role);
    }

    @Override
    public void removeRoleById(long id) {
        entityManager.remove(entityManager.find(Role.class, id));
    }

    @Override
    public List<Role> getAllRoles() {
        return entityManager.createQuery("from Role").getResultList();
    }

    @Override
    public Role getRoleByName(String name) {
        return entityManager.createQuery("select r from Role r where r.name=:role", Role.class)
                .setParameter("role", name).getSingleResult();
    }
}
