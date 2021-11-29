using System;


namespace Escola
{
    public class Aluno : Pessoa{

        public float Nota{get; set;}
        public void ApresentarAluno(){

            Console.WriteLine($"Nota: {Nota}");
        }
    }
}