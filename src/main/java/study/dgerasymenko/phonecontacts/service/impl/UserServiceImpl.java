package study.dgerasymenko.phonecontacts.service.impl;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import study.dgerasymenko.phonecontacts.model.User;
import study.dgerasymenko.phonecontacts.repository.UserRepository;
import study.dgerasymenko.phonecontacts.service.UserService;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User create(User user) {
        if (user != null) {
            return userRepository.save(user);
        }
        return null; //TODO throw new NullEntityReferenceException("User cannot be 'null'");
    }

    @Override
    public User readById(Long id) {
        if (id != null) {
            return userRepository.findById(id)
                    .orElseThrow(() -> new EntityNotFoundException("User with id " + id + " not found"));
        }
        return null; //TODO throw new NullIdReferenceException("User id cannot be 'null'");
    }

    @Override
    public User readByLogin(String login) {
        return userRepository.findUserByLogin(login)
                .orElseThrow(() -> new EntityNotFoundException("User with login " + login + " not found"));
    }

    @Override
    public User update(User user) {
        if (user != null) {
            readById(user.getId());
            return userRepository.save(user);
        }
        return null; //TODO throw new NullEntityReferenceException("User cannot be 'null'");
    }

    @Override
    public void delete(Long id) {
        userRepository.delete(readById(id));
    }

    @Override
    public List<User> getAll() {
        List<User> users = userRepository.findAll();
        return users.isEmpty() ? new ArrayList<>() : users;
    }
}
