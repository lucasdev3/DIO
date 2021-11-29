using System;

namespace Escola
{
    public class Pessoa
    {
        public string Nome {get; set;}

        public int Idade {get; set;}
        
        public virtual void Apresentar(){
            Console.WriteLine($"Ola, meu nome é {Nome}");
        }

    }
}