package br.com.edutech30.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.edutech30.model.Cadastro;

public interface CadastroRepository extends JpaRepository<Cadastro, Long> {

}
