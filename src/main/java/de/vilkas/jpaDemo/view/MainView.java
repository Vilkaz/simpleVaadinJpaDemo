package de.vilkas.jpaDemo.view;

import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;
import de.vilkas.jpaDemo.model.Item;
import de.vilkas.jpaDemo.service.ItemService;
import de.vilkas.jpaDemo.view.item.ItemGrid;
import de.vilkas.jpaDemo.view.item.ItemGridBuilder;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDate;
import java.util.Arrays;

/**
 * Created by Vilkas on 04/03/2018.
 */
@SpringUI
public class MainView extends UI {

    @Autowired
    private ItemService itemService;

    @Override
    protected void init(final VaadinRequest vaadinRequest) {

        Item item1 = new Item(null, "ein Item", LocalDate.now().minusYears(1));
        Item item2 = new Item(null, "ein weiteres Item", LocalDate.now().minusMonths(1));

        ItemGrid itemGrid = new ItemGridBuilder()
                    .withItems(Arrays.asList(item1, item2))
                    .withService(itemService)
                    .build();

        Button save = new Button("save", e -> itemGrid.saveItems());
        Button loadItems = new Button("load", e -> itemGrid.loadItems());
        final VerticalLayout mainContent = new VerticalLayout(itemGrid, save, loadItems);
        setContent(mainContent);
    }

}
