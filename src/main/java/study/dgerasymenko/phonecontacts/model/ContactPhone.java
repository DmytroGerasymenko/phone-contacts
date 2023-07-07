package study.dgerasymenko.phonecontacts.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Pattern;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import java.util.List;

@NoArgsConstructor @Getter @Setter
@Entity
@Table(name = "phones")
public class ContactPhone {
    @Id
    @GeneratedValue(generator = "generator", strategy = GenerationType.IDENTITY)
    @GenericGenerator(name = "generator", strategy = "increment")
    private Long id;

    @Pattern(regexp = "^\\+\\d{12}$", message = "The phone format must be +XXXXXXXXXXXX, where X is a digit")
    @Column(name = "phone", nullable = false, unique = true)
    private String phone;

    @ManyToMany
    @JoinTable(name = "phone_contact",
            joinColumns = @JoinColumn(name = "phone_id"),
            inverseJoinColumns = @JoinColumn(name = "contact_id"))
    private List<Contact> contacts;
}
