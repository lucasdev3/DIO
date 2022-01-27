using System.Reflection.Metadata;

namespace ReferenceTypes
{
    public class Pessoa
    {
        public string Nome { get; set; }
        public int Idade { get; set; }
        public string Documento { get; set; }
        public static void TrocarNome(Pessoa nomeAntigo, string nomeNovo)
        {
            nomeAntigo.Nome = nomeNovo;
        }

        public Pessoa Clone()
        {
            return new Pessoa()
            {
                Documento = this.Documento,
                Idade = this.Idade,
                Nome = this.Nome
            };
        }
    }
}