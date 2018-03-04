package de.vilkas.jpaDemo.service;

import de.vilkas.jpaDemo.repository.ItemRepository;
import de.vilkas.jpaDemo.model.Item;

import java.util.Collection;
import java.util.List;

/**
 * Created by Vilkas on 04/03/2018.
 */
public class ItemService{


    private ItemRepository repository;

    public ItemService(final ItemRepository repository) {
        this.repository = repository;
    }

    public void save(Item item) {
        repository.save(item);
    }

    public Collection<Item> loadAll() {
       return repository.findAll();
    }

    public void saveAll(final Collection<Item> items) {
        repository.saveAll(items);
    }
}
