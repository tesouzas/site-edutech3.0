package br.com.edutech30.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.edutech30.model.Permissao;
import br.com.edutech30.repository.PermissaoRepository;

@Controller
@RequestMapping("/permissao")
public class PermissaoController {

	@Autowired
	private PermissaoRepository permissaoRepository;

	@GetMapping
	public ModelAndView listar() {
		ModelAndView modelAndView = new ModelAndView("permissao/listar");

		List<Permissao> permissoes = permissaoRepository.findAll();
		modelAndView.addObject("permissoes", permissoes);

		return modelAndView;
	}

	@GetMapping("/cadastrar")
	public ModelAndView cadastrar() {
		ModelAndView modelAndView = new ModelAndView("permissao/cadastro");

		modelAndView.addObject("permissao", new Permissao());

		return modelAndView;
	}

	@PostMapping("/cadastrar")
	public ModelAndView cadastrar(Permissao permissao) {

		ModelAndView modelAndView = new ModelAndView("redirect:/permissao");

		permissaoRepository.save(permissao);

		return modelAndView;
	}

	@GetMapping("/{id}/excluir")
	public ModelAndView excluir(@PathVariable("id") Long id) {

		ModelAndView modelAndView = new ModelAndView("redirect:/permissao");

		permissaoRepository.deleteById(id);

		return modelAndView;

	}
	
	@GetMapping("/{id}/editar")
	public ModelAndView editar(@PathVariable Long id) {
		ModelAndView modelAndView = new ModelAndView("permissao/edicao");
		
		Permissao permissao = new Permissao();
		modelAndView.addObject("permissao", permissao);
		
		return modelAndView;
	}
	
	@PostMapping("/{id}/editar")
	public ModelAndView editar(Permissao permissao) {
		ModelAndView modelAndView = new ModelAndView("redirect:/permissao");
		permissaoRepository.save(permissao);
		
		return modelAndView;
	}

}
