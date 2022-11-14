using Microsoft.EntityFrameworkCore;

namespace API_Edutech30.Models
{
    public class Edutech30DbContext : DbContext
    {
        public Edutech30DbContext(DbContextOptions<Edutech30DbContext> options) : base(options) { }

        public DbSet<Cadastro> Cadastros { get; set; }
        public DbSet<Contato> Contatos { get; set; }
        public DbSet<Enviar_Material> Enviar_Materiais { get; set; }
        public DbSet<Permissao> Permissoes { get; set; }
    }
}
