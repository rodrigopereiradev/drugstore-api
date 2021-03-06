package br.com.rodrigo.drugstoreapi.models;

import br.com.rodrigo.drugstoreapi.models.commons.BaseEntity;
import br.com.rodrigo.drugstoreapi.models.enums.PhoneType;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Entity
public class Phone extends BaseEntity implements Serializable {

    private static final long serialVersionUID = -2269310176880076605L;

    private String number;

    @Enumerated(EnumType.STRING)
    private PhoneType phoneType;

    public Phone() {}

    public Phone(Long id, String number, PhoneType phoneType) {
        super(id);
        this.number = number;
        this.phoneType = phoneType;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public PhoneType getPhoneType() {
        return phoneType;
    }

    public void setPhoneType(PhoneType phoneType) {
        this.phoneType = phoneType;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "number='" + super.id + '\'' +
                "number='" + number + '\'' +
                ", phoneType=" + phoneType +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
