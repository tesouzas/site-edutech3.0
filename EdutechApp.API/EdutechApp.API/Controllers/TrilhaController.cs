using EdutechApp.API.Models;
using Microsoft.AspNetCore.Http;
using Microsoft.AspNetCore.Mvc;
using Microsoft.EntityFrameworkCore;
using MySqlX.XDevAPI;

namespace EdutechApp.API.Controllers
{
    [Route("api/[controller]")]
    [ApiController]
    public class TrilhaController : ControllerBase
    {
        private readonly EdutechappDbContext _context;

        public TrilhaController(EdutechappDbContext context)
        {
            _context = context;
        }

        [HttpGet]
        public IEnumerable<Trilha> GetTrilhas()
        {
            return _context.Trilhas;
        }

        [HttpGet("{id}")]
        public IActionResult GetTrilhaPorId(int id)
        {
            Trilha trilha = _context.Trilhas.SingleOrDefault(modelo => modelo.id == id);
            if (trilha == null)
            {
                return NotFound();
            }
            return new ObjectResult(trilha);
        }

        [HttpPost]
        public IActionResult CriarTrilha(Trilha item)
        {
            if (item == null)
            {
                return BadRequest();
            }

            _context.Trilhas.Add(item);
            _context.SaveChanges();
            return new ObjectResult(item);
        }

        [HttpPut("{id}")]
        public IActionResult AtualizaTrilha(int id, Trilha item)
        {
            if (id != item.id)
            {
                return BadRequest();
            }
            _context.Entry(item).State = EntityState.Modified;
            _context.SaveChanges();

            return new NoContentResult();
        }

        [HttpDelete("{id}")]
        public IActionResult DeletaTrilha(int id)
        {
            var trilha = _context.Trilhas.SingleOrDefault(m => m.id == id);

            if (trilha == null)
            {
                return BadRequest();
            }

            _context.Trilhas.Remove(trilha);
            _context.SaveChanges();
            return Ok(trilha);
        }
    }
}
