using System;

namespace Escola{

    class Program {

        static void Main(string[] args){

            Aluno a1 =  new Aluno();

            a1.Nome = "Lucas";
            a1.Idade = 25;
            a1.Nota = 9.5F;
            


            Professor p1 = new Professor();

            p1.Nome = "Teacher";
            p1.Idade = 45;
            p1.Salario = 2000;

            a1.Apresentar();
            p1.Apresentar();
        }
    }
}