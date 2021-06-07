package com.derick.bookstore.dtos;

import java.io.Serializable;

import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;

import com.derick.bookstore.domain.Livro;

public class LivroDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	@NotEmpty(message = "Campo TITULO requerido")
	@Length(min = 3, max = 100, message = "O campo TITULO deve ter entre 13 e 100 caracteres")
	private String titulo;
	public LivroDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public LivroDTO(Livro obj) {
		super();
		this.id = obj.getId();
		this.titulo = obj.getTitulo();
	}
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	

}
