package br.com.rodrigo.drugstoreapi.models;

import br.com.rodrigo.drugstoreapi.models.commons.BaseEntity;
import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name = "municipio")
public class City extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 1167081299815847607L;

    @Column(name = "NO_MUNICIPIO_SIACI")
    private String name;

    public City() {}

    public City(Long id, String name) {
        super(id);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof City)) return false;
        if (!super.equals(o)) return false;

        City city = (City) o;

        return name != null ? name.equals(city.name) : city.name == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                '}';
    }
}
