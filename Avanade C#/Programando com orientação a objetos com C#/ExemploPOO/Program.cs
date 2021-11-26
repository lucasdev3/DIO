using System;
using ExemploPOO.Models;

namespace ExemploPOO{

    class Program{

        static void Main(string[] arg){

            Pessoa p1 = new Pessoa();
            p1.Nome = "Lucas";
            p1.Idade = 25;

            p1.Apresentar();
        }
    }
}