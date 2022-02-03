package ProgramacaoOrientadaObjetos.part2;

public class Main {

    public static void main(String[] args) {



        Funcionario a = new Faxineiro();
        Funcionario b = new Gerente();
        Funcionario c = new Vendedor();

        double f = Math.pow(2, 2);
        System.out.println(f);

        //Gerente d = new Funcionario();
        //Vendedor e = (Vendedor) new Funcionario();
    }
}
