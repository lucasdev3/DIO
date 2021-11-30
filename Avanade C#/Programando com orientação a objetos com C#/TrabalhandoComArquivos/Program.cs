using System;
using System.IO;
using TrabalhandoComArquivos.Helper;

namespace TrabalhandoComArquivos
{
    class Program
    {
        public static void Main(string[] args) 
        {
            FileHelper lista = new FileHelper();

            var caminho = "C:\\TrabalhandoComArquivos";
            lista.ListarDiretorios(caminho);
        }
    }
}