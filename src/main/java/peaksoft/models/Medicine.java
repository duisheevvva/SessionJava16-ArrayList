package peaksoft.models;

import java.time.LocalDate;

public class Medicine {
    private Long id;
    private String name;
    private int price;
    private String description;
    private LocalDate expirationDate;

    public Medicine() {
    }

    public Medicine(Long id, String name, int price, String description, LocalDate expirationDate) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
        this.expirationDate = expirationDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    @Override
    public String toString() {
        return "Medicine{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                ", expirationDate=" + expirationDate +
                '}';
    }
}
