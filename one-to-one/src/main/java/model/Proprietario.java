package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "proprietarios")
public class Proprietario {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	private String telefone;
	private String email;
	
	
	public Integer getCodigo() {
	return id;
	}
	
	public void setCodigo(Integer codigo) {
	this.id = codigo;
	}
	
	public String getNome() {
	return nome;
	}
	
	public void setNome(String nome) {
	this.nome = nome;
	}
	
	public String getTelefone() {
	return telefone;
	}
	
	public void setTelefone(String telefone) {
	this.telefone = telefone;
	}
	
	public String getEmail() {
	return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public Proprietario() {
	}

}
