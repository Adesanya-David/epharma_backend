package com.dao;

import com.entity.Item;
import org.springframework.data.repository.CrudRepository;

public interface ItemRepository extends CrudRepository <Item, Integer>{


}
