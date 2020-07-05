package com.gabriel.receitas.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.gabriel.receitas.entities.Receita;

@Repository
public interface ReceitaRepository extends JpaRepository<Receita, Integer> {
	
	@Query
	public Optional<List<Receita>> findByNomeIgnoreCaseLike(String nome);
}
