package study.dgerasymenko.phonecontacts.service;

import study.dgerasymenko.phonecontacts.model.Contact;

import java.util.List;

public interface ContactService {
    Contact create(Contact contact);
    Contact readById(Long id);
    Contact update(Contact contact);
    void delete(Long id);
    List<Contact> getByUserLogin(String name);
    List<Contact> getAll();
}
