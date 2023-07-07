package study.dgerasymenko.phonecontacts.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import study.dgerasymenko.phonecontacts.model.ContactPhone;

import java.util.Optional;

@Repository
public interface ContactPhoneRepository extends JpaRepository<ContactPhone, Long> {
    Optional<ContactPhone> findContactPhoneByPhone(String phone);
}
