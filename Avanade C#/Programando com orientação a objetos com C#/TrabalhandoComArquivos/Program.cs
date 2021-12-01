using System;
using System.Collections.Generic;
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
            var caminhoPathCombine = Path.Combine(caminho, "Pasta Teste 1");
            var caminhoArquivo = Path.Combine(caminho, "arquivo-teste-stream");
            var caminhoArquivoTeste = Path.Combine(caminho, "arquivo-teste");
            var caminhoArquivoTesteCopia = Path.Combine(caminho, "arquivo-teste-bkp.txt");
            var novoCaminhoArquivo = Path.Combine(caminho, "Pasta Teste 2", "arquivo-teste-stream.txt");


            var listaString = new List<string> {"Linha 1", "Linha 2", "Linha 3"};
            var listaStringContinuacao = new List<string> {"Linha 4", "Linha 5", "Linha 6"};
            // lista.ListarDiretorios(caminho);
            // lista.ListarArquivosDiretorios(caminho);
            // lista.CriarDiretorio(caminhoPathCombine);
            // lista.ApagarDiretorio(caminhoPathCombine, true);
            // lista.CriarArquivoTexto(caminhoArquivo, "Olá! Teste de escrita de arquivo");
            // lista.CriarArquivoTextoStream(caminhoArquivo, listaString);
            // lista.AdicionarTextoStream(caminhoArquivo, listaStringContinuacao);
            // lista.LearArquivoStream(caminhoArquivo);
            // lista.MoverArquivo(caminhoArquivo, novoCaminhoArquivo, false);
            // lista.CopiarArquivo(caminhoArquivoTeste, caminhoArquivoTesteCopia, false);
            lista.DeletarArquivo(caminhoArquivoTesteCopia);
        }
    }
}