package de.vilkas.jpaDemo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;

/**
 * Created by Vilkas on 04/03/2018.
 */
@Entity
public class Item    {

    @Id
    @GeneratedValue
    private Long id;
    private String description;
    private LocalDate date;

    public Item() {
    }

    public Item(final Long id, final String description, final LocalDate date) {
        this.id = id;
        this.description = description;
        this.date = date;
    }

    public Long getId() {
        return id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(final String description) {
        this.description = description;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(final LocalDate date) {
        this.date = date;
    }
}
