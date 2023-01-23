package br.com.lucasdev3.designprojectdio.repository;

import br.com.lucasdev3.designprojectdio.model.Endereco;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends CrudRepository<Endereco, String> {

}
