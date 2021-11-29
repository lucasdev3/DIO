namespace Banco.Models
{
    public abstract class Conta
    {
         protected double saldo;

         public abstract void Creditar(double valor);

         public void ExibirSaldo(){
             Console.WriteLine($"Seu saldo é: {saldo}");
         }
    }
}