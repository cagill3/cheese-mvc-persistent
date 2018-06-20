package org.launchcode.models.data;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Category {

    @Id
    @GeneratedValue
    private int id;

    @NotNull
    @Size(min=3, max=15)
    private String name;

    public int idGetter() {
        return id;
    }

    public String nameGetter() {

        return name;
    }

    public Category() {

    }

    public Category(String name) {
        this.name = name;
    }
}
