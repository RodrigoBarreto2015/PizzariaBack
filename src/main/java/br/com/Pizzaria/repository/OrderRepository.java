package br.com.Pizzaria.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.Pizzaria.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
