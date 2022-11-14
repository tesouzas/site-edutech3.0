package br.com.edutech30.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.edutech30.model.Cadastro;

public interface CadastroRepository extends JpaRepository<Cadastro, Long> {
	Optional<Cadastro> findByEmail(String email);
}
