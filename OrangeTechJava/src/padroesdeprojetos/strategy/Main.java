package padroesdeprojetos.strategy;

import padroesdeprojetos.strategy.context.Robo;
import padroesdeprojetos.strategy.implementation.ComportamentoAgressivo;
import padroesdeprojetos.strategy.implementation.ComportamentoDefensivo;
import padroesdeprojetos.strategy.implementation.ComportamentoNormal;
import padroesdeprojetos.strategy.interfaceRobo.Comportamento;

public class Main {

  public static void main(String[] args) {

    Comportamento normal = new ComportamentoNormal();
    Comportamento defensivo = new ComportamentoDefensivo();
    Comportamento agressivo = new ComportamentoAgressivo();

    Robo robo = new Robo();
    robo.setStrategy(normal);
    robo.mover();
    robo.mover();
    robo.setStrategy(defensivo);
    robo.mover();
    robo.mover();
    robo.setStrategy(agressivo);
    robo.mover();
    robo.mover();

  }

}
