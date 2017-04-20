package br.com.orcamentoconstrucao.controle;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import br.com.orcamentoconstrucao.modelo.Cliente;

public class PersistenceBanco {

	EntityManagerFactory emf;
	EntityManager em;
	
	public PersistenceBanco() {

		emf = Persistence.createEntityManagerFactory("ALAN");
		em = emf.createEntityManager();
	}
	
	@SuppressWarnings("unused")
	public void  obterPorId(int id) {
		em.getTransaction().begin();
		Cliente cliente = em.find(Cliente.class, id);
		
		em.getTransaction().commit();
		emf.close();
	}
	
	public void  salvar(Object objeto) {
		em.getTransaction().begin();
		em.merge(objeto);
		em.getTransaction().commit();
		emf.close();
	}
	
	public void  remover(Cliente cliente) {
		em.getTransaction().begin();
		em.remove(cliente);
		em.getTransaction().commit();
		emf.close();
	}
	
	@SuppressWarnings("unchecked")// ARRUMAR
	public ArrayList<Cliente> pesquisarPorNome() {
		em.getTransaction().begin();
		// "select Servico.nome, Servico.valor from Servico servico  where Servico.nome = 'Piso'"
		Query consulta = em.createQuery("select new list(nome, valor) from Cliente cliente  where Servico.nome = 'Alan'");
		ArrayList<Cliente> cliente = (ArrayList<Cliente>) consulta.getResultList();
		em.getTransaction().commit();
		emf.close();
		return cliente;
	}
}
