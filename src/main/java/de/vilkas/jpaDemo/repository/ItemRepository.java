package de.vilkas.jpaDemo.repository;

import de.vilkas.jpaDemo.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Vilkas on 04/03/2018.
 */
public interface ItemRepository extends JpaRepository<Item, Long> {
}
