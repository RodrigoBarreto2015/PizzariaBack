package br.com.Pizzaria.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.Pizzaria.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long>{

}
