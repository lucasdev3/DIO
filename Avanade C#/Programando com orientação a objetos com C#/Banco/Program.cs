using System;
using Banco.Models;

namespace Banco{

    class Program {

        public static void Main(string[] args) {

            Corrente c = new Corrente();

            c.Creditar(100);

            c.ExibirSaldo();
        }
    }
}