// See https://aka.ms/new-console-template for more information

namespace OlaMundo
{
    class Program
    {
        public static void Main(string[] arg)
        {
            var a = 5;
            var b = 10;


            var calculadora = new Calculadora();

            Console.WriteLine("Soma: " + calculadora.Soma(a, b));
            Console.WriteLine("Subtracao: " + calculadora.Subtracao(a, b));
            Console.WriteLine("Multiplicacao: " + calculadora.Multiplicacao(a, b));
            Console.WriteLine("Divisao: " + calculadora.Divisao(a, b));


        }
    }
}
