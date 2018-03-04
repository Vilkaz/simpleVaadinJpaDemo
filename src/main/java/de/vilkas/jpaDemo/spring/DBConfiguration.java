package de.vilkas.jpaDemo.spring;

import de.vilkas.jpaDemo.repository.ItemRepository;
import de.vilkas.jpaDemo.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Vilkas on 04/03/2018.
 */
@Configuration
public class DBConfiguration {

    @Autowired
    private ItemRepository itemRepository;

    @Bean
    public ItemService itemService() {
        return new ItemService(itemRepository);
    }

}
