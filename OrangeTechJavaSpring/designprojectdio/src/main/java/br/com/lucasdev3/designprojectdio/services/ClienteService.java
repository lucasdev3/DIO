package br.com.lucasdev3.designprojectdio.services;

import br.com.lucasdev3.designprojectdio.model.Cliente;

public interface ClienteService {

  Iterable<Cliente> buscarTodos();

  Cliente buscarPorId(Long id);

  void inserir(Cliente cliente);

  void atualizar(Long id, Cliente cliente);

  void deletar(Long id);

}
