package com.github.morinb.periodic.dtos;

import javax.persistence.*;

/**
 * @author Baptiste MORIN
 */
@Entity
@Table(name = "element_category", schema = "elements")
@NamedQueries({
        @NamedQuery(name = "Category.findAll", query = "select c from Category c"),
        @NamedQuery(name = "Category.findByNumber", query = "select c from Category c where c.number = :number"),
        @NamedQuery(name = "Category.findByName", query = "select c from Category c where c.name = :name")
})
public class Category {
    @Id
    private Integer number;
    private String name;

    public Category() {
    }

    public Category(Integer number, String name) {
        this.number = number;
        this.name = name;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public static Category create(EntityManager em, Integer number, String name) {
        Category cat = em.find(Category.class, number);
        if (cat == null) {
            cat = new Category(number, name);
            em.persist(cat);
            cat = em.find(Category.class, number);
        }

        return cat;
    }
}
