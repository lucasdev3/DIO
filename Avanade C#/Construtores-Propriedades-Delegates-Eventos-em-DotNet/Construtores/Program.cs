using System;
using Construtores.Models;

namespace ExemploConstrutores
{
    class Program
    {
        static void Main(string[] args)
        {

            Aluno a1 = new Aluno("Lucas", "Souza");
            
            // Log log = Log.GetInstance();
            // log.PropriedadeLog = "Teste instancia";

            // Log log2 = Log.GetInstance();
            // System.Console.WriteLine(log2.PropriedadeLog);

            // Pessoa p1 = new Pessoa();
            // p1.Apresentar();

        } 
    }
}
