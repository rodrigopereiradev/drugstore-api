package br.com.rodrigo.drugstoreapi.models;

import br.com.rodrigo.drugstoreapi.models.commons.BaseEntity;
import java.io.Serializable;
import javax.persistence.Entity;

@Entity
public class Email extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 4154837468502489831L;

    private String address;

    public Email(Long id, String address) {
        super(id);
        this.address = address;
    }

    public String getAddress() {

        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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
