package io.swagger.customizacao.repository;


import io.swagger.customizacao.entity.ClienteEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Clientes extends JpaRepository<ClienteEntity, Long> {

	ClienteEntity findByCpfAndPassword(String cpf, String password); 
}
