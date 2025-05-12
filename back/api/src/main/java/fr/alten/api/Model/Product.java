package fr.alten.api.model;

import jakarta.persistence.*;

@Entity
@Table(name = "product")
public class Product {
    private enum statusEnum {
        INSTOCK,LOWSTOCK,OUTOFSTOCK
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String code;
    private String name;
    private String description;
    private String image;
    private String category;
    private Integer price;
    private Integer quantity;
    private String internalReference;
    private Integer shellId;
    private statusEnum inventoryStatus;
    private Integer rating;
    private Long createAt;
    private Long updateAt;



    public Product(Long id, String code, String name, String description, String image, String category, Integer price, Integer quantity, String internalReference, Integer shellId, statusEnum inventoryStatus, Integer rating, Long createAt, Long updateAt) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.description = description;
        this.image = image;
        this.category = category;
        this.price = price;
        this.quantity = quantity;
        this.internalReference = internalReference;
        this.shellId = shellId;
        this.inventoryStatus = inventoryStatus;
        this.rating = rating;
        this.createAt = createAt;
        this.updateAt = updateAt;
    }


    //GETTER
    public Long getId() {
        return id;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getImage() {
        return image;
    }

    public String getCategory() {
        return category;
    }

    public Integer getPrice() {
        return price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public String getInternalReference() {
        return internalReference;
    }

    public Integer getShellId() {
        return shellId;
    }

    public statusEnum getInventoryStatus() {
        return inventoryStatus;
    }

    public Integer getRating() {
        return rating;
    }

    public Long getCreateAt() {
        return createAt;
    }

    public Long getUpdateAt() {
        return updateAt;
    }

    //SETTER
    public void setCode(String code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public void setInternalReference(String internalReference) {
        this.internalReference = internalReference;
    }

    public void setShellId(Integer shellId) {
        this.shellId = shellId;
    }

    public void setInventoryStatus(statusEnum inventoryStatus) {
        this.inventoryStatus = inventoryStatus;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public void setCreateAt(Long createAt) {
        this.createAt = createAt;
    }

    public void setUpdateAt(Long updateAt) {
        this.updateAt = updateAt;
    }
}
