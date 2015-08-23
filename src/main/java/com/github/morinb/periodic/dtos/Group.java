package com.github.morinb.periodic.dtos;

import javax.persistence.*;

/**
 * @author Baptiste MORIN
 */
@Entity
@Table(name = "element_group", schema = "elements")
@NamedQueries({
        @NamedQuery(name = "Group.findAll", query = "select g from Group g"),
        @NamedQuery(name = "Group.findByNumber", query = "select g from Group g where g.number = :number"),
        @NamedQuery(name = "Group.findByName", query = "select g from Group g where g.name = :name"),
})
public class Group {
    @Id
    private Integer number;

    private String name;

    public Group() {
    }

    public Group(Integer number, String name) {
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

    @Override
    public String toString() {
        return "Group " + number + (name == null ? "" : " (" + name + ")");
    }

    public static Group create(EntityManager em, Integer number, String name) {
        Group group = em.find(Group.class, number);
        if (group == null) {
            group = new Group(number, name);
            em.persist(group);
            group = em.find(Group.class, number); // get an attached object.
        }
        return group;
    }
}
