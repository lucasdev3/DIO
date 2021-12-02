using Calculadora.Models;

namespace Calculadora
{
    class Program
    {
        public delegate void Operacao(int x, int y);
        static void Main(string[] args)
        {
            Matematica m = new Matematica(10, 20);
            m.Somar();

            // Operacao op = new Operacao(Calculadora.Somar);
            // op += Calculadora.Subtrair;

            // op.Invoke(10, 10);
        }
    }
}