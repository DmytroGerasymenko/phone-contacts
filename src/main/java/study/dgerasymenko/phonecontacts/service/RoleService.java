package study.dgerasymenko.phonecontacts.service;

import study.dgerasymenko.phonecontacts.model.Role;

import java.util.List;

public interface RoleService {
    Role create(Role role);
    Role readById(Long id);
    Role update(Role role);
    void delete(Long id);
    List<Role> getAll();
}
