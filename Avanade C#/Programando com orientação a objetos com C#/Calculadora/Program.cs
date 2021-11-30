using System;
using Calculadora.Models;
using Calculadora.Interfaces;

namespace Calculadora{

    class Program{

        public static void Main(string[] args){

            ICalculadora calc = new Calculos();
            // Calculos calc = new Calculos();

            Console.WriteLine($"Resultado da soma: {calc.Somar(10, 10)}");
            Console.WriteLine($"Resultado da subtracao: {calc.Subtrair(10, 10)}");
            Console.WriteLine($"Resultado da divisao: {calc.Dividir(10, 10)}");
            Console.WriteLine($"Resultado da Multiplicacao: {calc.Multiplicar(10, 10)}");
        }
    }
}