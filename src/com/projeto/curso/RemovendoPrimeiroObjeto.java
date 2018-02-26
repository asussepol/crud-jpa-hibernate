 package com.projeto.curso;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.projeto.curso.modelo.Cliente;

public class RemovendoPrimeiroObjeto {

	public static void main(String[] args) {
		
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemploPU");
		EntityManager em= emf.createEntityManager();
		
		Cliente cliente= em.find(Cliente.class,3);
		
		em.getTransaction().begin();
		em.remove(cliente);
		em.getTransaction().commit();
		
		System.out.println("deletado com sucesso");
		
		em.close();
		emf.close();

	}

}
