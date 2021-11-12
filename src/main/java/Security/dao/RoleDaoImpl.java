package Security.dao;

import Security.model.Role;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class RoleDaoImpl implements RoleDao {

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
    public void deleteRoleById(Long id) {
        entityManager.createQuery("delete from Role where id =:id", Role.class).setParameter("id", id).executeUpdate();
    }

    @Override
    public List<Role> getAllRoles() {
        return entityManager.createQuery("from Role", Role.class).getResultList();
    }

    @Override
    public Role getRoleByName(String role) {
        return entityManager.createQuery("select u from Role u where u.role =:role", Role.class)
                .setParameter("role", role).getSingleResult();
    }
}
