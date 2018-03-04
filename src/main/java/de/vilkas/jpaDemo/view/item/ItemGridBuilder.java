package de.vilkas.jpaDemo.view.item;

import de.vilkas.jpaDemo.model.Item;
import de.vilkas.jpaDemo.service.ItemService;

import java.util.Collection;

/**
 * Created by Vilkas on 04/03/2018.
 */
public class ItemGridBuilder {
    private ItemService itemService;
    private Collection<Item> items;

    public ItemGridBuilder withService(ItemService itemService) {
        this.itemService = itemService;
        return this;
    }


    public ItemGridBuilder withItems(Collection<Item> items) {
        this.items = items;
        return this;
    }

    public ItemGrid build() {
        return new ItemGrid(items, itemService);
    }
}
