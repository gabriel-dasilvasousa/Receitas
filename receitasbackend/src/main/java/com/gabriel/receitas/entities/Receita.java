package com.gabriel.receitas.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class Receita implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	private String url;
	private Integer tempoDePreparo;
	private Integer rendimento;
	@Lob
	@Column(columnDefinition = "TEXT")
	private String ingredientes;
	@Lob
	@Column(columnDefinition = "TEXT")
	private String modoDePreparo;
	private String tipoDeReceita;
	
	public Receita() {
	}

	public Receita(Integer id, String nome, String url, Integer tempoDePreparo, Integer rendimento, String ingredientes,
			String modoDePreparo, String tipoDeReceita) {
		this.id = id;
		this.nome = nome;
		this.url = url;
		this.tempoDePreparo = tempoDePreparo;
		this.rendimento = rendimento;
		this.ingredientes = ingredientes;
		this.modoDePreparo = modoDePreparo;
		this.tipoDeReceita = tipoDeReceita;
	}
	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Integer getTempoDePreparo() {
		return tempoDePreparo;
	}

	public void setTempoDePreparo(Integer tempoDePreparo) {
		this.tempoDePreparo = tempoDePreparo;
	}

	public Integer getRendimento() {
		return rendimento;
	}

	public void setRendimento(Integer rendimento) {
		this.rendimento = rendimento;
	}

	public String getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(String ingredientes) {
		this.ingredientes = ingredientes;
	}

	public String getModoDePreparo() {
		return modoDePreparo;
	}

	public void setModoDePreparo(String modoDePreparo) {
		this.modoDePreparo = modoDePreparo;
	}

	public String getTipoDeReceita() {
		return tipoDeReceita;
	}

	public void setTipoDeReceita(String tipoDeReceita) {
		this.tipoDeReceita = tipoDeReceita;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Receita other = (Receita) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}
