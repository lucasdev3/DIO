using System;
using System.IO;

namespace TrabalhandoComArquivos.Helper
{
    public class FileHelper
    {
        public void ListarDiretorios(string caminho)
        {
            var retornoCaminho = Directory.GetDirectories(caminho, "*", SearchOption.AllDirectories);

            foreach (var i in retornoCaminho)
            {
                Console.WriteLine(i);
            }

            var check = Array.Exists(retornoCaminho, x => x == "SubPastaTeste1");

            if (retornoCaminho.Contains("C:\\TrabalhandoComArquivos\\Pasta Teste 1\\SubPastaTeste1"))
            {
                Console.WriteLine("Existe a pasta");
            }
            else
            {
                Console.WriteLine("Não existe a pasta");
            }
        }
    }
}