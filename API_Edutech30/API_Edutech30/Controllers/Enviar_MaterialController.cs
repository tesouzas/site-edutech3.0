using API_Edutech30.Models;
using Microsoft.AspNetCore.Http;
using Microsoft.AspNetCore.Mvc;
using Microsoft.EntityFrameworkCore;

namespace API_Edutech30.Controllers
{
    [Route("api/[controller]")]
    [ApiController]
    public class Enviar_MaterialController : ControllerBase
    {
        private readonly Edutech30DbContext _context;

        public Enviar_MaterialController(Edutech30DbContext context)
        {
            _context = context;
        }

        [HttpGet]
        public IEnumerable<Enviar_Material> GetEnviarMateriais()
        {
            return _context.Enviar_Materiais;
        }

        [HttpGet("{id}")]
        public IActionResult GetEnviarMaterialPorId(int id)
        {
            Enviar_Material enviar_Material = _context.Enviar_Materiais.SingleOrDefault(modelo => modelo.id == id);
            if (enviar_Material == null)
            {
                return NotFound();
            }
            return new ObjectResult(enviar_Material);
        }

        [HttpPost]
        public IActionResult CriarEnviar_Material(Enviar_Material item)
        {
            if (item == null)
            {
                return BadRequest();
            }

            _context.Enviar_Materiais.Add(item);
            _context.SaveChanges();
            return new ObjectResult(item);
        }

        [HttpPut("{id}")]
        public IActionResult AtualizaEnviar_Material(int id, Enviar_Material item)
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
        public IActionResult DeletaEnviar_Material(int id)
        {
            var enviar_Material = _context.Enviar_Materiais.SingleOrDefault(m => m.id == id);

            if (enviar_Material == null)
            {
                return BadRequest();
            }

            _context.Enviar_Materiais.Remove(enviar_Material);
            _context.SaveChanges();
            return Ok(enviar_Material);
        }
    }
}
