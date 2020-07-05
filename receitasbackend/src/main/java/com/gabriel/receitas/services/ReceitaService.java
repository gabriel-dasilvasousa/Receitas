package com.gabriel.receitas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gabriel.receitas.entities.Receita;
import com.gabriel.receitas.repositories.ReceitaRepository;

@Service
public class ReceitaService {

	@Autowired
	ReceitaRepository receitaRepo;
	
	public List<Receita> findByName(String name) {
		StringBuilder sb = new StringBuilder();
		sb.append("%");
		sb.append(name);
		sb.append("%");
		Optional<List<Receita>> obj = receitaRepo.findByNomeIgnoreCaseLike(sb.toString());
		return obj.orElse(null);
	}
	
	public List<Receita> findAll() {
		List<Receita> list = receitaRepo.findAll();
		return list;
	}
	
	public Receita insertReceita(Receita obj) {
		return receitaRepo.save(obj);
	}
}
