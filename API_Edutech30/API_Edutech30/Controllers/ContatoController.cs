using API_Edutech30.Models;
using Microsoft.AspNetCore.Http;
using Microsoft.AspNetCore.Mvc;
using Microsoft.EntityFrameworkCore;

namespace API_Edutech30.Controllers
{
    [Route("api/[controller]")]
    [ApiController]
    public class ContatoController : ControllerBase
    {
        private readonly Edutech30DbContext _context;

        public ContatoController(Edutech30DbContext context)
        {
            _context = context;
        }

        [HttpGet]
        public IEnumerable<Contato> GetContatos()
        {
            return _context.Contatos;
        }

        [HttpGet("{id}")]
        public IActionResult GetContatoPorId(int id)
        {
            Contato contato = _context.Contatos.SingleOrDefault(modelo => modelo.id == id);
            if (contato == null)
            {
                return NotFound();
            }
            return new ObjectResult(contato);
        }

        [HttpPost]
        public IActionResult CriarContato(Contato item)
        {
            if (item == null)
            {
                return BadRequest();
            }

            _context.Contatos.Add(item);
            _context.SaveChanges();
            return new ObjectResult(item);
        }

        [HttpPut("{id}")]
        public IActionResult AtualizaContato(int id, Contato item)
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
        public IActionResult DeletaContato(int id)
        {
            var contato = _context.Contatos.SingleOrDefault(m => m.id == id);

            if (contato == null)
            {
                return BadRequest();
            }

            _context.Contatos.Remove(contato);
            _context.SaveChanges();
            return Ok(contato);
        }
    }
}
