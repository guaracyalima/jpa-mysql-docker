package br.com.sushicopr.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.sushicorp.model.Cliente;

public class AtualizandoPrimeiroObjeto {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("exemploPU");

		EntityManager em = factory.createEntityManager();

		em.getTransaction().begin();
		
		Cliente client = em.find(Cliente.class, 1l);
		
		client.setProfissao("Analista legislativo");
		
		em.getTransaction().commit();
		
		
	}
}
