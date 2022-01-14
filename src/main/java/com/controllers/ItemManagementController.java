package com.controllers;

import com.entity.Item;
import com.services.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("management/api/v1/Item")
public class ItemManagementController {

    @Autowired
    private ItemsService itemsService;

    @RequestMapping("/item")
    public List<Item> getItems() {
        return itemsService.getAllItems();
    }

    @GetMapping("/Item/id")
    public Item getItems(@PathVariable String id){
        return itemsService.getItems(id);
    }

    @PostMapping("/Item")
    public void addItems(@RequestBody Item item) {
        itemsService.addItems(item);
    }

    @PutMapping("/Item/{id}")
    public void updateItems(@RequestBody Item item, @PathVariable String id){
        itemsService.updateItems(id, item);
    }

    @DeleteMapping("/items/{id}")
    public Item deleteItems(@RequestBody Item item, @PathVariable String id){
        itemsService.deleteItems(id, item);
    }

}