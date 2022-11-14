package br.com.edutech30.controllers;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import br.com.edutech30.model.EnviarMaterial;
import br.com.edutech30.repository.EnviarMaterialRepository;

@Controller
@RequestMapping("/material")
public class EnviarMaterialController {

	@Autowired
	private EnviarMaterialRepository enviarMaterialRepository;

	@GetMapping("/listar")
	public ModelAndView listar() {

		ModelAndView modelAndView = new ModelAndView("enviarMaterial/listar");

		List<EnviarMaterial> materiais = enviarMaterialRepository.findAll();
		modelAndView.addObject("materiais", materiais);

		return modelAndView;
	}

	@GetMapping("/cadastrar")
	public ModelAndView cadastrar() {

		ModelAndView modelAndView = new ModelAndView("enviarMaterial/enviarMaterial.html");

		modelAndView.addObject("enviarMaterial", new EnviarMaterial());

		return modelAndView;
	}

	@PostMapping("/cadastrar")
	public ModelAndView cadastrar(EnviarMaterial enviarMaterial, @RequestParam("fileMaterial") MultipartFile file)
			throws IOException {

		try {
			enviarMaterial.setArquivo(file.getBytes());
		} catch (IOException e) {
			e.printStackTrace();
		}

		ModelAndView modelAndView = new ModelAndView("redirect:/material");

		enviarMaterialRepository.save(enviarMaterial);

		return modelAndView;
	}

	@GetMapping("/arquivo/{id}")
	@ResponseBody
	public byte[] exibirArquivo(@PathVariable("id") Long id) {
		EnviarMaterial enviarMaterial = this.enviarMaterialRepository.getReferenceById(id);
		return enviarMaterial.getArquivo();
	}

	@GetMapping("/{id}/excluir")
	public ModelAndView excluir(@PathVariable("id") Long id) {

		ModelAndView modelAndView = new ModelAndView("redirect:/material");

		enviarMaterialRepository.deleteById(id);

		return modelAndView;

	}

	/*
	 * @GetMapping("/{id}/editar") public ModelAndView editar(@PathVariable Long id)
	 * { ModelAndView modelAndView = new ModelAndView("contato/edicao");
	 * 
	 * Contato contato = contatoRepository.getById(id);
	 * modelAndView.addObject("contato", contato);
	 * 
	 * return modelAndView; }
	 * 
	 * @PostMapping("/{id}/editar") public ModelAndView editar(Contato contato) {
	 * ModelAndView modelAndView = new ModelAndView("redirect:/contato");
	 * contatoRepository.save(contato);
	 * 
	 * return modelAndView; }
	 */

}
