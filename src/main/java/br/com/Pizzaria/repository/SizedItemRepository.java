package br.com.Pizzaria.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.Pizzaria.entities.Item;

public interface SizedItemRepository extends JpaRepository<Item, Long>{

}
