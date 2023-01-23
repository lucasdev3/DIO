package padroesdeprojetos.strategy.context;

import padroesdeprojetos.strategy.interfaceRobo.Comportamento;

public class Robo {

  private Comportamento strategy;

  public void setStrategy(Comportamento strategy) {
    this.strategy = strategy;
  }

  public void mover() {
    strategy.mover();
  }

}
