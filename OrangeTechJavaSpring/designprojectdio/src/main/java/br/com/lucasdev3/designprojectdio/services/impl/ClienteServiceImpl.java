package br.com.lucasdev3.designprojectdio.services.impl;

import br.com.lucasdev3.designprojectdio.model.Cliente;
import br.com.lucasdev3.designprojectdio.model.Endereco;
import br.com.lucasdev3.designprojectdio.repository.ClienteRepository;
import br.com.lucasdev3.designprojectdio.repository.EnderecoRepository;
import br.com.lucasdev3.designprojectdio.services.ClienteService;
import br.com.lucasdev3.designprojectdio.services.ViaCepService;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteServiceImpl implements ClienteService {

  @Autowired
  private final ClienteRepository clienteRepository;

  @Autowired
  private final EnderecoRepository enderecoRepository;

  @Autowired
  private final ViaCepService viaCepService;

  protected ClienteServiceImpl(ClienteRepository clienteRepository,
      EnderecoRepository enderecoRepository, ViaCepService viaCepService) {
    this.clienteRepository = clienteRepository;
    this.enderecoRepository = enderecoRepository;
    this.viaCepService = viaCepService;
  }

  @Override
  public Iterable<Cliente> buscarTodos() {
    try {
      final Iterable<Cliente> clientes = clienteRepository.findAll();
      if (clientes.iterator().hasNext()) {
        return clientes;
      }
      return null;
    } catch (Exception e) {
      e.printStackTrace();
      return null;
    }
  }

  @Override
  public Cliente buscarPorId(Long id) {
    try {
      final Optional<Cliente> cliente = clienteRepository.findById(id);
      return cliente.orElse(null);
    } catch (Exception e) {
      e.printStackTrace();
      return null;
    }
  }

  @Override
  public void inserir(Cliente cliente) {
    try {
      salvarCliente(cliente);
      System.out.println("Cliente salvo com sucesso!");
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  @Override
  public void atualizar(Long id, Cliente cliente) {
    final Optional<Cliente> clienteBd = clienteRepository.findById(id);
    if (clienteBd.isPresent()) {
      salvarCliente(cliente);
      System.out.println("Cliente atualizado com sucesso!");
    }
    System.out.println("Cliente não existe!");
  }

  @Override
  public void deletar(Long id) {
    try {
      clienteRepository.deleteById(id);
      System.out.println("Cliente deletado com sucesso!");
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  private void salvarCliente(Cliente cliente) {
    String cep = cliente.getEndereco().getCep();
    final Endereco endereco = enderecoRepository.findById(cep).orElseGet(() -> {
      Endereco novoEndereco = viaCepService.consultarCep(cep);
      enderecoRepository.save(novoEndereco);
      return novoEndereco;
    });
    cliente.setNome(cliente.getNome());
    cliente.setEndereco(endereco);
    clienteRepository.save(cliente);
  }

}
