package padroesdeprojetos.strategy.implementation;

import padroesdeprojetos.strategy.interfaceRobo.Comportamento;

public class ComportamentoNormal implements Comportamento {


  @Override
  public void mover() {
    System.out.println("Movendo-se normalmente...");
  }

}
