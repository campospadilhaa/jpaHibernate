package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Programa {

	/* insersão dos registros no banco de dados
	public static void main(String[] args) {

		// atributo id iniciado com null para que o banco execute INSERT
		Pessoa pessoa1 = new Pessoa(null, "Anderson Padilha", "anderson@gmail.com");
		Pessoa pessoa2 = new Pessoa(null, "Regiana Duarte", "regiana@gmail.com");
		Pessoa pessoa3 = new Pessoa(null, "Felipe Letícia", "felipeleticia@gmail.com");
		////

		// configuração da persistência para conexão com o banco de dados
		// nome que consta na tag persistence-unit configurada no arquivo persistence.xml
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		////

		// inicializada a transação no banco de dados
		entityManager.getTransaction().begin();

		// inserção no banco de dados
		entityManager.persist(pessoa1);
		entityManager.persist(pessoa2);
		entityManager.persist(pessoa3);
		////

		// finaliza a transação
		entityManager.getTransaction().commit();

		entityManager.close();
		entityManagerFactory.close();

		System.out.println("Transação finalizada");
	}*/

	public static void main(String[] args) {

		// configuração da persistência para conexão com o banco de dados
		// nome que consta na tag persistence-unit configurada no arquivo persistence.xml
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		////

		Pessoa pessoa = entityManager.find(Pessoa.class, 2);

		System.out.println(pessoa);

		entityManager.close();
		entityManagerFactory.close();

		System.out.println("Transação finalizada");
	}

	/* remover objeto do banco
	public static void main(String[] args) {

		// configuração da persistência para conexão com o banco de dados
		// nome que consta na tag persistence-unit configurada no arquivo persistence.xml
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		////

		Pessoa pessoa = entityManager.find(Pessoa.class, 2);

		System.out.println(pessoa);

		// inicializada a transação no banco de dados
		entityManager.getTransaction().begin();

		entityManager.remove(pessoa);

		// finaliza a transação
		entityManager.getTransaction().commit();

		entityManager.close();
		entityManagerFactory.close();

		System.out.println("Transação finalizada");
	}*/
}