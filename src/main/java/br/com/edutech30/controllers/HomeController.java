package br.com.edutech30.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping("/")
	public String Home() {		
		return "index";
	}
	
	@GetMapping("/infantil")
	public String infantil() {		
		return "infantil";
	}
	
	@GetMapping("/fundamentalI")
	public String fundamentalI() {		
		return "fund_I";
	}
	
	@GetMapping("/fundamentalII")
	public String fundamentalII() {		
		return "fund_II";
	}
	
	@GetMapping("/medio")
	public String medio() {		
		return "medio";
	}
	
	@GetMapping("/login")
	public String login() {		
		return "login";
	}
	
	@GetMapping("/sobre")
	public String sobreNos() {		
		return "sobreNos";
	}

}
