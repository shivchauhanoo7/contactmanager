package entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "contacts")
public class Contact {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String fullName;
    private LocalDate dateofBirth;

    @OneToOne(cascade = CascadeType.ALL)
    private Address address;

}
