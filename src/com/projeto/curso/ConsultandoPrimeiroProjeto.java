package com.projeto.curso;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.projeto.curso.modelo.Cliente;

public class ConsultandoPrimeiroProjeto {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemploPU");
		EntityManager em = emf.createEntityManager();
		
		Cliente cliente = em.find(Cliente.class, 1);
		System.out.println("nome :" + cliente.getNome() +""+ " profissao : " + cliente.getProfissao());
		
		em.close();
		emf.close();

	}

}
