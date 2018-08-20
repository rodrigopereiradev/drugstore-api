package br.com.rodrigo.drugstoreapi.models;

import br.com.rodrigo.drugstoreapi.models.commons.BaseEntity;
import javax.persistence.*;

@Entity
@Table(name = "municipio")
public class City extends BaseEntity {

    @Column(name = "NO_MUNICIPIO_SIACI")
    private String name;

    public City() {
        super();
    };

    public City(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                '}';
    }
}
