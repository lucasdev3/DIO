package ProgramacaoOrientadaObjetos.part1;

public class Veiculo {

    String cor;
    String modelo;
    double capacidadeTanque;


    public Veiculo(String cor, String modelo, double capacidadeTanque) {
        this.cor = cor;
        this.modelo = modelo;
        this.capacidadeTanque = capacidadeTanque;
    }

    String getCor() {
        return this.cor;
    }

    void setCor(String cor) {
        this.cor = cor;
    }

    String getModelo() {
        return this.modelo;
    }

    void setModelo(String modelo) {
        this.modelo = modelo;
    }

    double getCapacidadeTanque() {
        return this.capacidadeTanque;
    }

    void setCapacidadeTanque(double capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    public String info() {
        String cor = this.cor;
        String modelo = this.modelo;
        double capacidadeTanque = this.capacidadeTanque;

        return "Cor: " + cor + "\nModelo: " + modelo + "\nCapacidade atual do tanque: " + capacidadeTanque + " L";
    }

    // Método para calcular o valor para encher o tanque

    String totalValorTanque(double valorCombustivel) {

        return "O valor para encher o tanque é de: R$" + (capacidadeTanque * valorCombustivel);
    }
}

