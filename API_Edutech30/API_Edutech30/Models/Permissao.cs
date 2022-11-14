using System.ComponentModel.DataAnnotations;
using System.ComponentModel.DataAnnotations.Schema;

namespace API_Edutech30.Models
{
    [Table("permissao")]
    public class Permissao
    {
        [Key]
        public int id { get; set; }

        [Required(ErrorMessage = "Informe o tipo da permissao:")]
        [StringLength(50)]
        public string tipo { get; set; }
    }
}
