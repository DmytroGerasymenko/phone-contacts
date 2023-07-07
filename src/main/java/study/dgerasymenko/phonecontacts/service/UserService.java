package study.dgerasymenko.phonecontacts.service;

import study.dgerasymenko.phonecontacts.model.User;

import java.util.List;

public interface UserService {
    User create(User user);
    User readById(Long id);
    User readByLogin(String login);
    User update(User user);
    void delete(Long id);
    List<User> getAll();
}
