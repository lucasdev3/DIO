package br.com.lucasdev3.designprojectdio.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Getter;

@Entity
@Getter
public class Endereco implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  private String cep;

  private String logradouro;

  private String complemento;

  private String bairro;

  private String localidade;

  private String uf;

  private String ibge;

  private String gia;

  private String ddd;

  private String siafi;


}
