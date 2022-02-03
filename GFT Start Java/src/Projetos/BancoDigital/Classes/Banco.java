package Projetos.BancoDigital.Classes;

import java.util.List;

public class Banco {

    private String nome;
    protected List<Conta> contas;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

   public void incluirContas(Conta conta) {
        contas.add(conta);
   }

   public void listarContas() {
        for (Conta id : contas) {
            System.out.println(id);
        }
   }
}
