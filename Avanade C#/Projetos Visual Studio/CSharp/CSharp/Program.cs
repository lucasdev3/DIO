using System;
using Calculadora;

namespace Calculadora
{
    internal class Numeros
    {
        public float media(float numero1, float numero2)
        {
            return (numero1 + numero2) / 2;
        }
    }
}



namespace CSharp
{
    class Program
    {
        static void Main(string[] args)
        {
            var a = 5;
            var b = 10;

            Numeros media = new Numeros();
    
            Console.WriteLine("\nMédia: " + media.media(a, b));
        }
    }
}