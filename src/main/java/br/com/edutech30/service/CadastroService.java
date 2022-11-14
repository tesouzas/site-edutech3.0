package br.com.edutech30.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import br.com.edutech30.model.Cadastro;
import br.com.edutech30.repository.CadastroRepository;

@Service
public class CadastroService implements UserDetailsService {

	@Autowired
	private CadastroRepository cadastroRepository;

	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		Cadastro cadastro = cadastroRepository.findByEmail(email)
				.orElseThrow(() -> new UsernameNotFoundException("Usuário não encontrado"));

		return null;
	}

}
