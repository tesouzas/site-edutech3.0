using System.ComponentModel.DataAnnotations;
using System.ComponentModel.DataAnnotations.Schema;

namespace EdutechApp.API.Models
{
    [Table("Trilha")]
    public class Trilha
    {
        [Key]
        public int id { get; set; }

        [Required(ErrorMessage = "Digite seu Ano:")]
        [StringLength(50)]
        public string Ano { get; set; }

        [Required(ErrorMessage = "Informe a disciplina:")]
        public string Disciplina { get; set; }

        [Required(ErrorMessage = "Informe o Assunto:")]
        [StringLength(50)]
        public string Assunto { get; set; }
    }
}
