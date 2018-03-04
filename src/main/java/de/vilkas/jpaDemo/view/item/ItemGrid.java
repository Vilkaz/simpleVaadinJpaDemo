package de.vilkas.jpaDemo.view.item;

import com.vaadin.ui.Grid;
import de.vilkas.jpaDemo.model.Item;
import de.vilkas.jpaDemo.service.ItemService;
import de.vilkas.jpaDemo.util.LocalDateFormatter;

import java.util.Collection;

/**
 * Created by Vilkas on 04/03/2018.
 */
public class ItemGrid extends Grid<Item> {
    private Collection<Item> items;
    private ItemService itemService;

    private ItemGrid() {
        addColumn(Item::getId, id -> String.valueOf(id))
                .setCaption("Id");

        addColumn(Item::getDescription)
                .setCaption("Description");

        addColumn(Item::getDate, LocalDateFormatter::format)
                .setCaption("Date");
    }


    ItemGrid(final Collection<Item> items, final ItemService itemService) {
        this();
        this.items = items;
        this.itemService = itemService;
        setItems(items);
    }

    @Override
    public void setItems(Collection<Item> items) {
        this.items = items;
        super.setItems(items);
    }

    public void saveItems() {
        itemService.saveAll(items);
        super.setItems(items);
    }

    public void loadItems() {
        super.setItems(itemService.loadAll());
    }
}
