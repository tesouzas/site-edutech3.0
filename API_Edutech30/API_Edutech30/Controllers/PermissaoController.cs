using API_Edutech30.Models;
using Microsoft.AspNetCore.Http;
using Microsoft.AspNetCore.Mvc;
using Microsoft.EntityFrameworkCore;

namespace API_Edutech30.Controllers
{
    [Route("api/[controller]")]
    [ApiController]
    public class PermissaoController : ControllerBase
    {
        private readonly Edutech30DbContext _context;

        public PermissaoController(Edutech30DbContext context)
        {
            _context = context;
        }

        [HttpGet]
        public IEnumerable<Permissao> GetPermissoes()
        {
            return _context.Permissoes;
        }

        [HttpGet("{id}")]
        public IActionResult GetPermissaoPorId(int id)
        {
            Permissao permissao = _context.Permissoes.SingleOrDefault(modelo => modelo.id == id);
            if (permissao == null)
            {
                return NotFound();
            }
            return new ObjectResult(permissao);
        }

        [HttpPost]
        public IActionResult CriarPermissao(Permissao item)
        {
            if (item == null)
            {
                return BadRequest();
            }

            _context.Permissoes.Add(item);
            _context.SaveChanges();
            return new ObjectResult(item);
        }

        [HttpPut("{id}")]
        public IActionResult AtualizaPermissao(int id, Permissao item)
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
        public IActionResult DeletaPermissao(int id)
        {
            var permissao = _context.Permissoes.SingleOrDefault(m => m.id == id);

            if (permissao == null)
            {
                return BadRequest();
            }

            _context.Permissoes.Remove(permissao);
            _context.SaveChanges();
            return Ok(permissao);
        }
    }
}
