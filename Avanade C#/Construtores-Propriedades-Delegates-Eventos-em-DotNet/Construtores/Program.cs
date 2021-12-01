using System;
using Construtores.Models;

namespace ExemploConstrutores
{
    class Program
    {
        static void Main(string[] args)
        {
            
            Console.Write("Nome: ");
            string nome = Console.ReadLine();

            Console.Write("Sobrenome: ");
            string sobrenome = Console.ReadLine();

            Pessoa p1 = new Pessoa(nome, sobrenome);

            Console.WriteLine(p1.Apresentar());
            

        } 
    }
}
