package apl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.targettrust.model.Animal;
import com.targettrust.model.Especie;

public class TestaTransient {

	public static void main(String[] args) {

		try {

			Class.forName("org.postgresql.Driver");

			EntityManagerFactory factory = Persistence
					.createEntityManagerFactory("jpa");

			EntityManager fabrica = factory.createEntityManager();
			System.out.println("***** TABELAS Fabricadas *****");
			
			Animal aninal = new Animal("Rex", 145, 50, true, Especie.Mamíferos);
			fabrica.getTransaction().begin();
			fabrica.persist(aninal);
			fabrica.getTransaction().commit();
			
			Animal a = fabrica.find(Animal.class,1L);
			System.out.println(a.getImc());
			
			fabrica.close();
			factory.close();

		} catch (Exception e) {
			System.out.println("ERRO--->>\n");
			e.printStackTrace();
		}

	}
}
