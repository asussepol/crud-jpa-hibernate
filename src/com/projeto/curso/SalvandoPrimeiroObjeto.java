package com.projeto.curso;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.projeto.curso.modelo.Cliente;

public class SalvandoPrimeiroObjeto {

	public static void main(String[] args) {
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("exemploPU");
		EntityManager em = emf.createEntityManager();
		
		Cliente cliente = new Cliente();
		cliente.setNome("marcia");
		cliente.setIdade(32);
		cliente.setSexo("f");
		cliente.setProfissao("medica");
		em.getTransaction().begin();
		em.persist(cliente);
		em.getTransaction().commit();
		System.out.println("gravação efetuada com sucesso");
		
	//	em.close();
	}

}
