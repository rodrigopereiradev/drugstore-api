package br.com.rodrigo.drugstoreapi.models;

import br.com.rodrigo.drugstoreapi.models.commons.BaseEntity;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "State")
public class State extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 8671484097955862648L;

    @Column(name = "INITIALS")
    private String initials;

    @Column(name = "NAME")
    private String name;

    public State() {}

    public State(String initials, String name) {
        this.initials = initials;
        this.name = name;
    }

    public String getInitials() {
        return initials;
    }

    public void setInitials(String initials) {
        this.initials = initials;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "State{" +
                "initials='" + initials + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
