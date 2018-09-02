package br.com.rodrigo.drugstoreapi.models;

import br.com.rodrigo.drugstoreapi.models.commons.BaseEntity;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Address extends BaseEntity implements Serializable {

    private static final long serialVersionUID = -8660827284482545165L;

    private String street;

    private String number;

    private String complement;

    private String neighborhood;

    private String zipCode;

    @JoinColumn
    @ManyToOne
    private City city;

    @JoinColumn
    @ManyToOne
    private State state;

    public Address() {}

    public Address(Long id, String street, String number, String complement, String neighborhood, String zipCode,
                   City city, State state) {
        super(id);
        this.street = street;
        this.number = number;
        this.complement = complement;
        this.neighborhood = neighborhood;
        this.zipCode = zipCode;
        this.city = city;
        this.state = state;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getComplement() {
        return complement;
    }

    public void setComplement(String complement) {
        complement = complement;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", number='" + number + '\'' +
                ", complement='" + complement + '\'' +
                ", neighborhood='" + neighborhood + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", city=" + city +
                ", state=" + state +
                ", id=" + id +
                '}';
    }
}
