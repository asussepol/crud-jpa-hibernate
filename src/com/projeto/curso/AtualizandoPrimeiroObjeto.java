package com.projeto.curso;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.projeto.curso.modelo.Cliente;

public class AtualizandoPrimeiroObjeto {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemploPU");
		EntityManager em = emf.createEntityManager();
		
		
		Cliente cliente=em.find(Cliente.class,1);
		
		
		em.getTransaction().begin();
		cliente.setNome("Cesar Robero lopes");
		cliente.setProfissao("programador");
		
		
		em.getTransaction().commit();
		
		em.close();
		emf.close();
	}

}
