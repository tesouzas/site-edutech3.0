using System.ComponentModel.DataAnnotations;
using System.ComponentModel.DataAnnotations.Schema;

namespace API_Edutech30.Models
{
    [Table("contato")]
    public class Contato
    {
        [Key]
        public int id { get; set; }

        [Required(ErrorMessage = "Informe o assunto:")]
        [StringLength(50)]
        public string assunto { get; set; }

        [Required(ErrorMessage = "Informe a cidade:")]
        [StringLength(50)]
        public string cidade { get; set; }

        [Required(ErrorMessage = "Informe o email")]
        [StringLength(80)]
        public string email { get; set; }

        [Required(ErrorMessage = "Informe o estado")]
        [StringLength(50)]
        public string estado { get; set; }

        [Required(ErrorMessage = "Informe o logradouro")]
        [StringLength(80)]
        public string logradouro { get; set; }

        [Required(ErrorMessage = "Informe a mensagem")]
        [StringLength(300)]
        public string mensagem { get; set; }

        [Required(ErrorMessage = "Informe o nome")]
        [StringLength(80)]
        public string nome { get; set; }
    }
}
