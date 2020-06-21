package com.gabriel.receitas.resources;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.gabriel.receitas.entities.Receita;
import com.gabriel.receitas.services.ReceitaService;

@RestController
@RequestMapping(value = "/receitas")
public class ReceitaResource {

	@Autowired
	ReceitaService receitaService;
	
	@GetMapping
	public ResponseEntity<List<Receita>> findAll() {
		List<Receita> list = receitaService.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping("/{name}")
	public ResponseEntity<List<Receita>> findByName(@PathVariable String name){
		List<Receita> list = receitaService.findByName(name);
		return ResponseEntity.ok().body(list);
	}
	
	@PostMapping
	public ResponseEntity<Receita> insertReceita(@RequestBody Receita obj) {
		obj = receitaService.insertReceita(obj);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(obj.getId()).toUri();
		return ResponseEntity.created(uri).body(obj);
	} 
	
}
