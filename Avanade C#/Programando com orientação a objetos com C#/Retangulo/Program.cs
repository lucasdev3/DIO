using System;

namespace Retangulo{

    class Program {

        static void Main(string[] args){

            Retangulo retangulo = new Retangulo();


            retangulo.DefinirMedidas(5, 30);

            Console.WriteLine($"Área: {retangulo.ObterArea()}");

        }
    }
}