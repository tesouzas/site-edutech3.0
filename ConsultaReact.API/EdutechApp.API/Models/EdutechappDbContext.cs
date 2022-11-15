using Microsoft.EntityFrameworkCore;
using MySqlX.XDevAPI;

namespace EdutechApp.API.Models
{
    public class EdutechappDbContext : DbContext
    {
        public EdutechappDbContext(DbContextOptions<EdutechappDbContext> options) : base(options) { }
        
        public DbSet<Trilha> Trilhas { get; set; }
    }
}
