package br.com.algaworks.curso.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.algaworks.curso.model.Cliente;

public class SalvandoPrimeiroObjeto {

	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("exemploPU");
		
		EntityManager em = factory.createEntityManager();
		
		em.getTransaction().begin();
		Cliente client = new Cliente();
		client.setIdade(28);
		client.setNome("Jurubeba");
		client.setProfissao("Ladrao");
		client.setSexo("S");
		
		em.persist(client);
		em.getTransaction().commit();
		
		
	}

}
