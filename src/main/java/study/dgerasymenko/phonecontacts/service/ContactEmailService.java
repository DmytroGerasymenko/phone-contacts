package study.dgerasymenko.phonecontacts.service;

import study.dgerasymenko.phonecontacts.model.ContactEmail;

import java.util.List;

public interface ContactEmailService {
    ContactEmail create(ContactEmail contactEmail);
    ContactEmail readById(Long id);
    ContactEmail readByEmail(String email);
    ContactEmail update(ContactEmail contactEmail);
    void delete(Long id);
    List<ContactEmail> getAll();
}
