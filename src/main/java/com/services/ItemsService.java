package com.services;

import com.dao.ItemRepository;
import com.entity.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ItemsService {

    @Autowired
    private ItemRepository itemRepository;

    private final List<Item> items = new ArrayList<>(Arrays.asList(
            new Item(1, "Paracetamol", "painkiller"),
            new Item(2,"Panadol", "painkiller"),
            new Item(3, "Ciprofloxacin", "broad spectrum antibiotics")
    ));

    public List<Item> getAllItems() {
        List<Item> items = new ArrayList<>();
        itemRepository.findAll()
                .forEach(items::add);
        return items;
    }

    public Item getItems(Integer id){
        return items.stream()
                .filter(t -> t.getItemId().equals(id))
                .findFirst()
                .get();
    }

    public void addItems(Item items) {
        itemRepository  .save(items);
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


    public void deleteItems(String id) {
        items.removeIf(t -> t.getItemId().equals(id));
    }
}
