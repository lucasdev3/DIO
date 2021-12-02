using GetsSets.Models;

namespace GetsSets
{
    class Program
    {
        static void Main(string[] args)
        {
            Data data = new Data();

            // data.SetMes(20);
            data.Mes = 13;
            data.ApresentarMes();
        }
    }
}