package com.andr3xdev.EciLost.entities;

import java.time.LocalDate;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table (name = "item")

public class Item {
    // Getters
    // * Attributes of the class
    @Id
    @GeneratedValue

    private Long id;

    @column(name = "name")
    private String name;
    private LocalDate date;
    private String description;
    private Boolean reclaimed;
    private LocalDate reclaimedDate;
    private Boolean found;

    @column(name = "name")


    // * Constructor
    public Item(String name, String description) {
        this.name = name;
        this.description = description;
        this.date = LocalDate.now();
        this.reclaimed = false;
        this.reclaimedDate = null;
        this.found = false;
    }

    // * Methods
    // main methods

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", date=" + date +
                ", description='" + description + '\'' +
                ", reclaimed=" + reclaimed +
                ", reclaimedDate=" + reclaimedDate +
                ", found=" + found +
                '}';
    }

    // Setters

    // Getters

}