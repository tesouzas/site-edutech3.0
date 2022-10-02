package br.com.edutech30.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.edutech30.model.Contato;

public interface ContatoRepository extends JpaRepository<Contato, Long>{

}
