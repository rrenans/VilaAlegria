package com.vila.pet;

import javax.persistence.CascadeType;
// import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.vila.morador.Morador;

@Entity
@Table
public class Pet {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column
	private String especie;
	private String nome;
	
	// @ManyToOne(cascade = CascadeType.ALL)
	// @JoinColumn(name = "moradorId", referencedColumnName = "id")
	// private Morador morador;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	/*
	public Morador getMorador() {
		return morador;
	}
	public void setMorador(Morador morador) {
		this.morador = morador;
	}*/
	
	
	
}
