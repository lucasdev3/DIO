package ProgramacaoOrientadaObjetos.part1;

public class Main {

    public static void main(String[] args) {

        Carro a = new Carro("verde", "bmw", 17.5);

        System.out.println(a.info());

        System.out.println(a.totalValorTanque(6.99));

    }
}
