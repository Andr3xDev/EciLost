package Items_type;

import java.time.LocalDate;
import java.util.Objects;

public class Item {
    // * Attributes of the class
    private String name;
    private LocalDate date;
    private String description;
    private Boolean reclaimed;
    private LocalDate reclaimedDate;
    private Boolean found;

    // * Constructor
    public Item(String name, String description) {
        this.name = name;
        this.date = LocalDate.now();
        this.description = description;
        this.reclaimed = false;
        this.reclaimedDate = null;
        this.found = false;
    }

    // * Methods
    // main methods

    public void updateItem(String name, String description) {
        setName(name);
        setDescription(description);
    }

    public void showItem() {
        System.out.println("Name: " + getName());
        System.out.println("Date: " + getDate());
        System.out.println("Description: " + getDescription());
        System.out.println("Reclaimed: " + getReclaimed());
        System.out.println("Reclaimed Date: " + getReclaimedDate());
        System.out.println("Found: " + getFound());
    }

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
        if (Objects.equals(name, "")) {
            throw new IllegalArgumentException("Name can't be empty");
        }
        this.name = name;
    }

    public void setDate() {
        this.date = LocalDate.now();
    }

    public void setDescription(String description) {
        if (Objects.equals(name, "")) {
            throw new IllegalArgumentException("Description can't be empty");
        }
        this.description = description;
    }

    public void setReclaimed(Boolean reclaimed) {
        this.reclaimed = reclaimed;
    }

    public void setReclaimedDate() {
        this.reclaimedDate = LocalDate.now();
    }

    public void setFound(Boolean found) {
        this.found = found;
    }


    // Getters
    public String getName() {
        return this.name;
    }

    public LocalDate getDate() {
        return this.date;
    }

    public String getDescription() {
        return this.description;
    }

    public Boolean getReclaimed() {
        return this.reclaimed;
    }

    public String getReclaimedDate() {
        return this.reclaimedDate.toString();
    }

    public Boolean getFound() {
        return this.found;
    }
}