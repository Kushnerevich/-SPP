package logist.springlogicalapp.dao;

import logist.springlogicalapp.Model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleDao extends JpaRepository<Role, Long> {
}
