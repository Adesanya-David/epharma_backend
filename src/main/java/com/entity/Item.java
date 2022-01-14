package com.entity;

public class Item {

    private Integer itemId;
    private String itemName;

    public Item(){

    }

    public Item(Integer itemId, String itemName) {
        this.itemId = itemId;
        this.itemName = itemName;
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

    @Override
    public String toString() {
        return "Item{" +
                "itemId=" + itemId +
                ", itemName='" + itemName + '\'' +
                '}';
    }

}
