package br.com.rodrigo.drugstoreapi.models;

import br.com.rodrigo.drugstoreapi.models.commons.BaseEntity;
import br.com.rodrigo.drugstoreapi.models.enums.Gender;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.time.LocalDate;
import java.util.List;
import javax.persistence.*;

@Entity
public class Person extends BaseEntity {

    @Column
    private String name;

    @Column(unique = true)
    private String cpf;

    @Column
    @Enumerated(EnumType.STRING)
    private Gender gender;

    @Column
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone = "America/Sao_Paulo")
    private LocalDate birth;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn
    private Address address;

    @OneToOne(cascade = {CascadeType.PERSIST, CascadeType.REFRESH, CascadeType.MERGE})
    @JoinColumn(name = "person_id", unique = true, nullable = false)
    private Email email;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "person_id")
    private List<Phone> phones;

    public Person() {}

    public Person(Long id, String name, String cpf, Gender gender, LocalDate birth, Address address, Email email,
                  List<Phone> phones) {
        super(id);
        this.name = name;
        this.cpf = cpf;
        this.gender = gender;
        this.birth = birth;
        this.address = address;
        this.email = email;
        this.phones = phones;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public LocalDate getBirth() {
        return birth;
    }

    public void setBirth(LocalDate birth) {
        this.birth = birth;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Email getEmail() {
        return email;
    }

    public void setEmail(Email email) {
        this.email = email;
    }

    public List<Phone> getPhones() {
        return phones;
    }

    public void setPhones(List<Phone> phones) {
        this.phones = phones;
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", cpf='" + cpf + '\'' +
                ", gender=" + gender +
                ", birth='" + birth + '\'' +
                ", address=" + address +
                ", email=" + email +
                ", phones=" + phones +
                ", id=" + id +
                '}';
    }
}
