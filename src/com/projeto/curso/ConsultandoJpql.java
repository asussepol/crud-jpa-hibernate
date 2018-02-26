package com.projeto.curso;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.projeto.curso.modelo.Cliente;

public class ConsultandoJpql {

	public static void main(String[] args) {
		
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemploPU");
		EntityManager em = emf.createEntityManager();
		
		
		List<Cliente> clientes = em.createQuery("from Cliente where sexo='m'",Cliente.class ).getResultList();
		
		for(Cliente cliente:clientes){
			
			
			System.out.println("codigo: " + cliente.getCodigo());
			System.out.println("nome: " + cliente.getNome());
			System.out.println("Profissao: " + cliente.getProfissao());
			System.out.println("Sexo: " + cliente.getSexo());
			System.out.println("---------------------------------");
		}
	}

}
