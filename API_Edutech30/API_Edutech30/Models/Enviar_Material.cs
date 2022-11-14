using System.ComponentModel.DataAnnotations;
using System.ComponentModel.DataAnnotations.Schema;

namespace API_Edutech30.Models
{
    [Table("enviar_material")]
    public class Enviar_Material
    {
        [Key]
        public int id { get; set; }

        public string arquivo { get; set; }

        [Required(ErrorMessage = "Informe a cidade:")]
        [StringLength(50)]
        public string cidade { get; set; }

        [Required(ErrorMessage = "Informe o cpf")]
        public int cpf { get; set; }

        [Required(ErrorMessage = "Informe a descrição")]
        [StringLength(300)]
        public string descricao { get; set; }

        [Required(ErrorMessage = "Informe a disciplina")]
        [StringLength(80)]
        public string disciplina { get; set; }

        [Required(ErrorMessage = "Informe o email")]
        [StringLength(80)]
        public string email { get; set; }

        [Required(ErrorMessage = "Informe o estado")]
        [StringLength(50)]
        public string estado { get; set; }

        [Required(ErrorMessage = "Informe a instituição de ensino")]
        [StringLength(80)]
        public string instituto_ensino { get; set; }

        [Required(ErrorMessage = "Informe o nome")]
        [StringLength(80)]
        public string nome { get; set; }

        [Required(ErrorMessage = "Informe a rede")]
        [StringLength(80)]
        public string rede { get; set; }

        [Required(ErrorMessage = "Informe o resumo")]
        [StringLength(300)]
        public string resumo { get; set; }

        [Required(ErrorMessage = "Informe o telefone")]
        [StringLength(80)]
        public string telefone { get; set; }

        [Required(ErrorMessage = "Informe o tipo_conteudo")]
        [StringLength(80)]
        public string tipo_conteudo { get; set; }
    }
}
