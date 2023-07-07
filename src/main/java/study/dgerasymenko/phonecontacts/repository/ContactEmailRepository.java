package study.dgerasymenko.phonecontacts.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import study.dgerasymenko.phonecontacts.model.ContactEmail;

import java.util.Optional;

@Repository
public interface ContactEmailRepository extends JpaRepository<ContactEmail, Long> {
    Optional<ContactEmail> findContactEmailByEmail(String email);
}
