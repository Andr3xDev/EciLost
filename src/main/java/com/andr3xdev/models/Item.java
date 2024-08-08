package com.andr3xdev.models;

// * Imports
import jakarta.persistence.*;
import java.time.LocalDate;


// * Class

@Entity
@Table(name = "items")
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private LocalDate date;
    private String description;
    private Boolean reclaimed;
    private LocalDate reclaimedDate;
    private Boolean found;
    private Integer finder;
    private Integer publisher;


    // * Constructor

    public Item(String name, String description, Integer publisher) {
        this.name = name;
        this.date = LocalDate.now();
        this.description = description;
        this.reclaimed = false;
        this.reclaimedDate = null;
        this.found = null;
        this.finder = null;
        this.publisher = publisher;
    }

    public Item() {

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

    public void setName(String name) {
        this.name = name;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setReclaimed(Boolean reclaimed) {
        this.reclaimed = reclaimed;
    }

    public void setReclaimedDate(LocalDate reclaimedDate) {
        this.reclaimedDate = reclaimedDate;
    }

    public void setFound(Boolean found) {
        this.found = found;
    }

    public void setFinder(Integer finder) {
        this.finder = finder;
    }

    public void setPublisher(Integer publisher) {
        this.publisher = publisher;
    }


    // Getters

    public String getName() {
        return name;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getDescription() {
        return description;
    }

    public Boolean getReclaimed() {
        return reclaimed;
    }

    public LocalDate getReclaimedDate() {
        return reclaimedDate;
    }

    public Boolean getFound() {
        return found;
    }

    public Integer getFinder() {
        return finder;
    }

    public Integer getPublisher() {
        return publisher;
    }
}