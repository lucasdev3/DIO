namespace Construtores.Models
{
    public class Aluno : Pessoa
    {
        public Aluno(string nome, string sobrenome) : base(nome, sobrenome)
        {
            System.Console.WriteLine("Construtor classe aluno!");
        }
    }
}