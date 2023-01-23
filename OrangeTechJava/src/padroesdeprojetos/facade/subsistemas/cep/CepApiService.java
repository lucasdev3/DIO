package padroesdeprojetos.facade.subsistemas.cep;

public class CepApiService {

  private static CepApiService instancia = new CepApiService();

  private CepApiService() {
    super();
  }

  public static CepApiService getInstancia() {
    return instancia;
  }

  public String recuperarCidade(String cep) {
    return "Araraquara";
  }

  public String recuperarEstado(String cep) {
    return "SP";
  }

}
