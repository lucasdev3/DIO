package padroesdeprojetos.strategy.implementation;

import padroesdeprojetos.strategy.interfaceRobo.Comportamento;

public class ComportamentoAgressivo implements Comportamento {

  @Override
  public void mover() {
    System.out.println("Movendo-se agressivamente...");
  }

}
