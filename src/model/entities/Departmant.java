package model.entities;

import java.io.Serializable;
import java.util.Objects;

public class Departmant implements Serializable {
    private static final long serialVersionUID  = 1L;

    private Integer id;
    private String name;

    public Departmant(){}
    public Departmant(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Departmant that)) return false;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Departmant{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
