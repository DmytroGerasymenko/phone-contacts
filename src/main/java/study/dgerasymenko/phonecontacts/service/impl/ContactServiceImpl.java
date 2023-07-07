package study.dgerasymenko.phonecontacts.service.impl;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import study.dgerasymenko.phonecontacts.model.Contact;
import study.dgerasymenko.phonecontacts.repository.ContactRepository;
import study.dgerasymenko.phonecontacts.service.ContactService;

import java.util.ArrayList;
import java.util.List;

@Service
public class ContactServiceImpl implements ContactService {
    private final ContactRepository contactRepository;

    @Autowired
    public ContactServiceImpl(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }

    @Override
    public Contact create(Contact contact) {
        if (contact != null) {
            return contactRepository.save(contact);
        }
        return null; //TODO throw new NullEntityReferenceException("Contact cannot be 'null'");
    }

    @Override
    public Contact readById(Long id) {
        if (id != null) {
            return contactRepository.findById(id)
                    .orElseThrow(() -> new EntityNotFoundException("Contact with id " + id + " not found"));
        }
        return null; //TODO throw new NullIdReferenceException("Contact id cannot be 'null'");
    }

    @Override
    public Contact update(Contact contact) {
        if (contact != null) {
            readById(contact.getId());
            contactRepository.save(contact);
        }
        return null; //TODO throw new NullEntityReferenceException("Contact cannot be 'null'");
    }

    @Override
    public void delete(Long id) {
        contactRepository.delete(readById(id));
    }

    @Override
    public List<Contact> getByUserLogin(String login) {
        List<Contact> contacts = contactRepository.findContactsByOwnerLogin(login);
        return contacts.isEmpty() ? new ArrayList<>() : contacts;
    }

    @Override
    public List<Contact> getAll() {
        List<Contact> contacts = contactRepository.findAll();
        return contacts.isEmpty() ? new ArrayList<>() : contacts;
    }
}
