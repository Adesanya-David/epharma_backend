package com.items;

public class items {

    private final Integer itemId;
    private final String itemName;

    public items(Integer itemId, String itemName) {
        this.itemId = itemId;
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
        return "items{" +
                "itemId=" + itemId +
                ", itemName='" + itemName + '\'' +
                '}';
    }


}
