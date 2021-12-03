using System;

namespace Array
{
    class Program
    {
        static void Main(string[] args)
        {

            int[,] matriz = new int[4,2] 
            {
                { 8, 8 },
                { 10, 20 },
                { 50, 100 },
                { 90, 200 }
            };

            for (int i = 0; i < matriz.GetLength(0); i++)
            {
                for (int j = 0; j < matriz.GetLength(1); j++)
                {
                    System.Console.WriteLine(matriz[i, j]);
                }
            }
            // int[] arrayInteiros = new int[3];


            // arrayInteiros[0] = 10;
            // arrayInteiros[1] = 20;
            // arrayInteiros[2] = 30;



            // foreach(int i in arrayInteiros)
            // {
            //     System.Console.WriteLine(i);
            // }
        }
    }
}