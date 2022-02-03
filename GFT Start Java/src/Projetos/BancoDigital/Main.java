package Projetos.BancoDigital;

import Projetos.BancoDigital.Classes.*;

public class Main {

    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.setNome("Lucas");
        Banco banco = new Banco();
        banco.setNome("Banco do Lucas");


        Conta cc = new ContaCorrente(cliente, banco); // conta corrente

        Conta cp = new ContaPoupanca(cliente, banco); // conta poupança


        // Listar contas no Banco


        cc.depositar(100);
        cc.transferir(100, cp);

        cc.imprimirExtrato();
        System.out.println("");
        cp.imprimirExtrato();



    }
}
