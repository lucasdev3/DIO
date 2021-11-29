using System;


namespace Escola
{
    public class Aluno : Pessoa{

        public float Nota{get; set;}
        

        public override void Apresentar(){
            Console.WriteLine($"Olá, meu nome é {Nome} e minha nota foi de {Nota}");
        }
    }
}