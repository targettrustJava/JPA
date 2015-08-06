package apl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Fabrica {

	public static void main(String[] args) {

		try {

			Class.forName("org.postgresql.Driver");

			EntityManagerFactory factory = Persistence
					.createEntityManagerFactory("jpa");

			EntityManager fabrica = factory.createEntityManager();
			System.out.println("***** TABELAS Fabricadas *****");
			fabrica.close();
			factory.close();

		} catch (Exception e) {
			System.out.println("ERRO--->>\n");
			e.printStackTrace();
		}

	}
}
