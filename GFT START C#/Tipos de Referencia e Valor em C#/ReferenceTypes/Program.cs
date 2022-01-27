using ReferenceTypes;
using static System.Console;

class Program {

    public static void Main()
    {
        Pessoa pessoa1 = new Pessoa();

        pessoa1.Nome = "Lucas";
        pessoa1.Idade = 25;
        pessoa1.Documento = "1234";

        // Aqui passamos a mesma referência de pessoa1
        // Pessoa pessoa2 = pessoa1;

        // Agora passamos referências diferentes.
        Pessoa pessoa2 = new Pessoa();
        pessoa2.Nome = pessoa1.Nome;
        pessoa2.Idade = pessoa1.Idade;
        pessoa2.Documento = pessoa1.Documento;

        //Verificar o código abaixo na classe pessoa. Lá será clonado

        Pessoa pessoa3 = pessoa1.Clone();

        Pessoa.TrocarNome(pessoa1, "Lucas Souza");

         WriteLine($@"
         O nome de pessoa1 é: {pessoa1.Nome}
         O nome de pessoa2 é: {pessoa2.Nome}
         O nome de pessoa3 é: {pessoa3.Nome}
         ");
    }
}