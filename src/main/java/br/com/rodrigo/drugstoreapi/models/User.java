package br.com.rodrigo.drugstoreapi.models;

import br.com.rodrigo.drugstoreapi.models.commons.BaseEntity;
import java.util.Collection;
import javax.persistence.*;

@Entity
public class User extends BaseEntity {

    @Column(unique = true)
    private String username;

    @Column(unique = true)
    private String password;

    @Column
    private Boolean enabled;

    @Column
    private String avatar;

    @JoinColumn
    @OneToMany
    private Collection<Role> authorities;

    @JoinColumn
    @OneToOne(cascade = {CascadeType.PERSIST})
    private Person person;

    public User() {}

    public User(Long id, String username, String password, Boolean enabled, String avatar, Collection<Role> authorities, Person person) {
        super(id);
        this.username = username;
        this.password = password;
        this.enabled = enabled;
        this.avatar = avatar;
        this.authorities = authorities;
        this.person = person;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public Collection<Role> getAuthorities() {
        return authorities;
    }

    public void setAuthorities(Collection<Role> authorities) {
        this.authorities = authorities;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
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
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", enabled=" + enabled +
                ", avatar='" + avatar + '\'' +
                ", authorities=" + authorities +
                ", person=" + person +
                ", id=" + id +
                '}';
    }
}
