using System.ComponentModel.DataAnnotations;
using System.ComponentModel.DataAnnotations.Schema;

namespace API_Edutech30.Models
{
    [Table("cadastro")]
    public class Cadastro
    {
        [Key]
        public int id { get; set; }

        [Required(ErrorMessage = "Informe o email:")]
        [StringLength(50)]
        public string email { get; set; }

        [Required(ErrorMessage = "Informe o Nome:")]
        [StringLength(50)]
        public string nome { get; set; }

        [Required(ErrorMessage = "Informe a permissao")]
        public int permissao { get; set; }

        [Required(ErrorMessage = "Informe a senha")]
        public string senha { get; set; }

    }
}
