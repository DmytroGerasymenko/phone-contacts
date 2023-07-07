package study.dgerasymenko.phonecontacts.service.impl;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import study.dgerasymenko.phonecontacts.model.ContactEmail;
import study.dgerasymenko.phonecontacts.repository.ContactEmailRepository;
import study.dgerasymenko.phonecontacts.service.ContactEmailService;

import java.util.ArrayList;
import java.util.List;

@Service
public class ContactEmailServiceImpl implements ContactEmailService {
    private final ContactEmailRepository contactEmailRepository;

    @Autowired
    public ContactEmailServiceImpl(ContactEmailRepository contactEmailRepository) {
        this.contactEmailRepository = contactEmailRepository;
    }

    @Override
    public ContactEmail create(ContactEmail contactEmail) {
        if (contactEmail != null) {
            return contactEmailRepository.save(contactEmail);
        }
        return null; //TODO throw new NullEntityReferenceException("ContactEmail cannot be 'null'");
    }

    @Override
    public ContactEmail readById(Long id) {
        if (id != null) {
            return contactEmailRepository.findById(id)
                    .orElseThrow(() -> new EntityNotFoundException("ContactEmail with id " + id + " not found"));
        }
        return null; //TODO throw new NullIdReferenceException("ContactEmail id cannot be 'null'");
    }

    @Override
    public ContactEmail readByEmail(String email) {
        return contactEmailRepository.findContactEmailByEmail(email)
                .orElseThrow(() -> new EntityNotFoundException("ContactEmail with email " + email + " not found"));
    }

    @Override
    public ContactEmail update(ContactEmail contactEmail) {
        if (contactEmail != null) {
            readById(contactEmail.getId());
            contactEmailRepository.save(contactEmail);
        }
        return null; //TODO throw new NullEntityReferenceException("ContactEmail cannot be 'null'");
    }

    @Override
    public void delete(Long id) {
        contactEmailRepository.delete(readById(id));
    }

    @Override
    public List<ContactEmail> getAll() {
        List<ContactEmail> emails = contactEmailRepository.findAll();
        return emails.isEmpty() ? new ArrayList<>() : emails;
    }
}
