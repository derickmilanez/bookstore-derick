package com.derick.bookstore.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.derick.bookstore.domain.Categoria;
import com.derick.bookstore.domain.Livro;
import com.derick.bookstore.repositories.CategoriaRepository;
import com.derick.bookstore.repositories.LivroRepository;

@Service
public class DBService {
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	@Autowired
	private LivroRepository livroRepository;
	
	public void instanciaBaseDeDados() {
		Categoria cat1 = new Categoria(null, "Informatica", "Livros de informatica");
		Categoria cat2 = new Categoria(null, "Fantasia", "Livros de fantasia");
		
		Livro l1 = new Livro(null,"LINGUAGEM C: COMPLETA E DESCOMPLICADA","Andre Backes","Criada em 1972 nos laboratorios Bell por Dennis Ritchie, a linguagem C ...",cat1);
		Livro l2 = new Livro(null,"Java 8 – Ensino Didatico: Desenvolvimento e Implementacao de Aplicacoes", "Sergio Furgeri","Java tem se desenvolvido muito nos ultimos anos, fato que a tem colocado entre as linguagens de programacao mais usadas. ... ", cat1);
		Livro l3 = new Livro(null,"PHP Moderno: Novos recursos e boas praticas","Josh Lockhart", "O PHP esta passando por um renascimento, embora possa ser dificil perceber, com tantos tutoriais PHP online desatualizados. ... ", cat1);
		Livro l4 = new Livro(null, "Trono de Vidro", "Sarah J. Maas", "A magia ha muito abandonou Adarlan. Um perverso rei governa, punindo impiedosamente as minorias rebeldes ...", cat2);
		Livro l5 = new Livro(null, "A Rainha Vermelha", "Victoria Aveyard", "Red Queen e um livro de fantasia para jovens escrito pela autora americana Victoria Aveyard, publicado nos pela editora HarperCollins e no Brasil pela Editora Seguinte no dia 9 de junho de 2015. ...", cat2);
		
		
		cat1.getLivros().addAll(Arrays.asList(l1,l2, l3));
		cat2.getLivros().addAll(Arrays.asList(l4,l5));
		
		this.categoriaRepository.saveAll(Arrays.asList(cat1, cat2));
		this.livroRepository.saveAll(Arrays.asList(l1, l2, l3, l4, l5));
	}
	
}
