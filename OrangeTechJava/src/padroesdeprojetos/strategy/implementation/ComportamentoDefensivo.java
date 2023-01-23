package padroesdeprojetos.strategy.implementation;

import padroesdeprojetos.strategy.interfaceRobo.Comportamento;

public class ComportamentoDefensivo implements Comportamento {

  @Override
  public void mover() {
    System.out.println("Movendo-se defensivamente...");
  }

}
