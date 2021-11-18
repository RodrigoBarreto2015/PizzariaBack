package br.com.Pizzaria.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import br.com.Pizzaria.entities.Item;

@NoRepositoryBean
public interface ItemRepository extends JpaRepository<Item, Long>{

}
