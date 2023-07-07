package study.dgerasymenko.phonecontacts.service;

import study.dgerasymenko.phonecontacts.model.ContactPhone;

import java.util.List;

public interface ContactPhoneService {
    ContactPhone create(ContactPhone contactPhone);
    ContactPhone readById(Long id);
    ContactPhone readByPhone(String phone);
    ContactPhone update(ContactPhone contactPhone);
    void delete(Long id);
    List<ContactPhone> getAll();
}
