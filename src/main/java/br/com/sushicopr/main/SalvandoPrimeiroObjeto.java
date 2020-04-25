package br.com.sushicopr.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.sushicorp.model.Cliente;

public class SalvandoPrimeiroObjeto {

	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("exemploPU");
		
		EntityManager em = factory.createEntityManager();
		
		em.getTransaction().begin();
		Cliente client = new Cliente();
		client.setIdade(28);
		client.setNome("Irmão do Jorel");
		client.setProfissao("Programador");
		client.setSexo("S");
		
		em.persist(client);
		em.getTransaction().commit();
		
		
	}

}
