package com.mballem.curso.boot.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@SuppressWarnings("serial")
@Entity
@Table(name = "ENDERECOS")
public class Endereco extends AbstractEntity<Long> {
	
	
	@Column(nullable = 	false)
	private String logradouro;
	
	@NotBlank(message = "O nome do cargo é obrigatório.")
	@Column(nullable = 	false)
	private String bairro;
	
	@Column(nullable = 	false)
	private String cidade;
	
	@NotNull(message = "Selecione uma UF.")
	@Column(nullable = 	false, length = 2)
	@Enumerated(EnumType.STRING)
	private UF uf;
	
	@Size(message = "Deve conter {max} caracteres.")
	@Column(nullable = 	false, length = 7)
	private String cep;

	@NotNull(message = "Número é obrigatório. Informe 0 para s/n.")
	@Column(nullable = 	false, length = 5)
	private Integer numero;

	@Column
	private String complemento;

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public UF getUf() {
		return uf;
	}

	public void setUf(UF uf) {
		this.uf = uf;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	
	
}
