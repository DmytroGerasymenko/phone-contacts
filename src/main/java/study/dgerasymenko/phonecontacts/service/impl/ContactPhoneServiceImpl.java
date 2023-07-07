package study.dgerasymenko.phonecontacts.service.impl;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import study.dgerasymenko.phonecontacts.model.ContactPhone;
import study.dgerasymenko.phonecontacts.repository.ContactPhoneRepository;
import study.dgerasymenko.phonecontacts.service.ContactPhoneService;

import java.util.ArrayList;
import java.util.List;

@Service
public class ContactPhoneServiceImpl implements ContactPhoneService {
    private final ContactPhoneRepository contactPhoneRepository;

    @Autowired
    public ContactPhoneServiceImpl(ContactPhoneRepository contactPhoneRepository) {
        this.contactPhoneRepository = contactPhoneRepository;
    }

    @Override
    public ContactPhone create(ContactPhone contactPhone) {
        if (contactPhone != null) {
            return contactPhoneRepository.save(contactPhone);
        }
        return null; //TODO throw new NullEntityReferenceException("ContactPhone cannot be 'null'");
    }

    @Override
    public ContactPhone readById(Long id) {
        if (id != null) {
            return contactPhoneRepository.findById(id)
                    .orElseThrow(() -> new EntityNotFoundException("ContactPhone with id " + id + " not found"));
        }
        return null; //TODO throw new NullIdReferenceException("ContactPhone id cannot be 'null'");
    }

    @Override
    public ContactPhone readByPhone(String phone) {
        return contactPhoneRepository.findContactPhoneByPhone(phone)
                .orElseThrow(() -> new EntityNotFoundException("ContactPhone with phone " + phone + " not found"));
    }

    @Override
    public ContactPhone update(ContactPhone contactPhone) {
        if (contactPhone != null) {
            readById(contactPhone.getId());
            return contactPhoneRepository.save(contactPhone);
        }
        return null; //TODO throw new NullEntityReferenceException("ContactPhone cannot be 'null'");
    }

    @Override
    public void delete(Long id) {
        contactPhoneRepository.delete(readById(id));
    }

    @Override
    public List<ContactPhone> getAll() {
        List<ContactPhone> phones = contactPhoneRepository.findAll();
        return phones.isEmpty() ? new ArrayList<>() : phones;
    }
}
