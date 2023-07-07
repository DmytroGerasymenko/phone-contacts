package study.dgerasymenko.phonecontacts.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import java.util.List;

@NoArgsConstructor @Getter @Setter
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(generator = "generator", strategy = GenerationType.IDENTITY)
    @GenericGenerator(name = "generator", strategy = "increment")
    private Long id;

    @NotBlank(message = "The login cannot be empty")
    @Column(name = "login", nullable = false, unique = true)
    private String login;

    @NotBlank(message = "The password cannot be empty")
    @Column(name = "password", nullable = false)
    private String password;

    @ManyToOne
    @JoinColumn(name = "role_id")
    private Role role;

    @OneToMany(mappedBy = "owner")
    private List<Contact> contacts;
}
