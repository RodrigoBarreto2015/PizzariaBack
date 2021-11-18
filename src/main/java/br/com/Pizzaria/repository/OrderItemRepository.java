package br.com.Pizzaria.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.Pizzaria.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
