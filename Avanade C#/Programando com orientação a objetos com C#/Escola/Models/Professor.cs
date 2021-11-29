using System;

namespace Escola
{
    public class Professor : Pessoa{

        public float Salario{get; set;}
        public void ApresentarProfessor(){
            Console.WriteLine($"Salario {Salario}");
        }      
    }

}
