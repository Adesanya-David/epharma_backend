package com.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Item {

    @Id
    private Integer itemId;
    private String itemName;
    private String category;
    private String description;

    public Item(){

    }

    public Item(Integer itemId, String itemName, String category) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.category = category;
        this.description = description;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public Integer getItemId() {
        return itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Item{" +
                "itemId=" + itemId +
                ", itemName='" + itemName + '\'' +
                ", category='" + category + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

}
