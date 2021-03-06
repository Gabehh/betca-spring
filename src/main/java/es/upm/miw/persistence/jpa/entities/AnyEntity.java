package es.upm.miw.persistence.jpa.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class AnyEntity {

    @Id
    @GeneratedValue
    private Integer id;

    private String value;

    public AnyEntity() {
        //Empty for framework
    }

    public AnyEntity(String value) {
        this.value = value;
    }

    public Integer getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        return this == obj || obj != null && getClass() == obj.getClass() && (id.equals(((AnyEntity) obj).id));
    }

    @Override
    public String toString() {
        return "AnyEntity [id=" + id + ", value=" + value + "]";
    }

}
