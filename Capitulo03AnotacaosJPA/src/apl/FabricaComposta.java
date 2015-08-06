package apl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.ids.*;

public class FabricaComposta {
	private static EntityManagerFactory factory;

	public static void main(String[] args) {

		try {
			factory = Persistence
					.createEntityManagerFactory("jpa");
			EntityManager em = factory.createEntityManager();

			MaterialDidaticoPKEmbeddable pk = new MaterialDidaticoPKEmbeddable(7, "JAVAWEB"); 
			
			MaterialDidaticoEmbeddable md = new MaterialDidaticoEmbeddable();

			
			md.setPk(pk);
			md.setDescricao("Curso de Fundamentos de Java na versão 7");
			
			em.getTransaction().begin();

			em.persist(md);
			em.getTransaction().commit();

			em.close();

			System.out.println("Fabrica Funcionou ; )");

		} catch (Exception e) {
			System.out.println("OCORREU ESSE ERRO_______\n" + e.getMessage());
		}

	}
}