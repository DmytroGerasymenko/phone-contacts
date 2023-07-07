package study.dgerasymenko.phonecontacts.service.impl;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import study.dgerasymenko.phonecontacts.model.Role;
import study.dgerasymenko.phonecontacts.repository.RoleRepository;
import study.dgerasymenko.phonecontacts.service.RoleService;

import java.util.ArrayList;
import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {
    private final RoleRepository roleRepository;

    @Autowired
    public RoleServiceImpl(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    @Override
    public Role create(Role role) {
        if (role != null) {
            return roleRepository.save(role);
        }
        return null; //TODO throw new NullEntityReferenceException("Role cannot be 'null'");
    }

    @Override
    public Role readById(Long id) {
        if (id != null) {
            return roleRepository.findById(id)
                    .orElseThrow(() -> new EntityNotFoundException("Role with id " + id + " not found"));
        }
        return null; //TODO throw new NullIdReferenceException("Role id cannot be 'null'");
    }

    @Override
    public Role update(Role role) {
        if (role != null) {
            readById(role.getId());
            return roleRepository.save(role);
        }
        return null; //TODO throw new NullEntityReferenceException("Role cannot be 'null'");
    }

    @Override
    public void delete(Long id) {
        roleRepository.delete(readById(id));
    }

    @Override
    public List<Role> getAll() {
        List<Role> roles = roleRepository.findAll();
        return roles.isEmpty() ? new ArrayList<>() : roles;
    }
}
