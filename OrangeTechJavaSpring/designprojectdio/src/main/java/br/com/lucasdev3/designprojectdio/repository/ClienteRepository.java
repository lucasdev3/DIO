package br.com.lucasdev3.designprojectdio.repository;

import br.com.lucasdev3.designprojectdio.model.Cliente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Long> {

}
