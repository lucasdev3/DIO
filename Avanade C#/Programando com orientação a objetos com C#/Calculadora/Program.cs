using System;
using Calculadora.Models;

namespace Calculadora{

    class Program{

        public static void Main(string[] args){

            
            Calculos calc = new Calculos();

            Console.WriteLine($"Resultado da primeira soma: {calc.Somar(10, 10)}");
            Console.WriteLine($"O resultado da segunda soma: {calc.Somar(10, 10, 10)}");

        }
    }
}