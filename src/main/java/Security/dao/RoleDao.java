package Security.dao;

import Security.model.Role;

import java.util.List;

public interface RoleDao {

    void addRole(Role role);

    void updateRole(Role role);

    void deleteRoleById(Long id);

    List<Role> getAllRoles();

    Role getRoleByName(String role);
}
