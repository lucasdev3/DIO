package padroesdeprojetos.facade.facade;

import padroesdeprojetos.facade.subsistemas.cep.CepApiService;
import padroesdeprojetos.facade.subsistemas.crm.CrmService;

public class Facade {

  public static void migrarCliente(String nome, String cep) {

    String cidade = CepApiService.getInstancia().recuperarCidade(cep);
    String estado = CepApiService.getInstancia().recuperarEstado(cep);

    CrmService.gravarCliente(nome, cep, cidade, estado);


  }

}
