package com.items;

import com.users.user;
import org.springframework.security.core.userdetails.User;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("management/api/v1/items")
public class ItemManagementController {
    private static final List<items> ITEMS = Arrays.asList(
            new items(1, "Floxinor"),
            new items(2, "Tylosin"),
            new items(3, "Paracetamol"),
            new items(4,"Ciprofloxacin")
    );

    @GetMapping
    public static List<items> getItems() {
        System.out.println("getItems");
        return ITEMS;
    }

    @PostMapping
    public void addNewItem(@RequestBody ItemManagementController Items){
        System.out.println("addNewItem");
    }

//    @DeleteMapping(path = "{itemId}")
//    public void deleteItem(PathVariable("itemId") Integer itemId){
//        System.out.println(itemId);
//    }
}