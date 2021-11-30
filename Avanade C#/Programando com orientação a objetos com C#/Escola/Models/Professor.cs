using System;

namespace Escola
{
    public class Professor : Pessoa{

        public float Salario{get; set;}
        
        public override void Apresentar(){
            Console.WriteLine($"Olá, meu nome é {Nome} e meu salario é de R${Salario}");
        }
        
    }

}
