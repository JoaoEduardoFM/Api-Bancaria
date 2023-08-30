package br.com.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.model.entity.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
	
}
