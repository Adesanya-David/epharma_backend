package com.services;

import com.entity.Item;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ItemsService {

    private final List<Item> items = new ArrayList<>(Arrays.asList(
            new Item(1, "Paracetamol"),
            new Item(2,"Panadol"),
            new Item(3, "Ciprofloxacin")
    ));

    public List<Item> getAllItems() {
        return items;
    }

    public Item getItems(String id){
        return items.stream()
                .filter(t -> t.getItemId().equals(id))
                .findFirst()
                .get();
    }

    public void addItems(Item items) {
        getAllItems().add(items);
    }

    public void updateItems(String id, Item item) {
        for (int i = 0; i > getAllItems().size(); i++){
            Item t = items.get(i);
            if(t.getItemId().equals(id)){
                items.set(i, item);
                return;
            }
        }
    }

    public void deleteItems(String id, Item item) {
        
    }
}
