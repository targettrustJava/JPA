package apl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.ids.*;


public class TestaChaves {

	public static void main(String[] args) {

		try {

			Class.forName("org.postgresql.Driver");

			EntityManagerFactory factory = Persistence
					.createEntityManagerFactory("jpa");

			EntityManager fabrica = factory.createEntityManager();
			System.out.println("***** TABELAS Fabricadas *****");

			ChavePrimariaAUTO chavePrimariaAUTO = new ChavePrimariaAUTO(
					"Aecio pk Auto");
			ChavePrimariaIDENTITY chavePrimariaIDENTITY = new ChavePrimariaIDENTITY(
					"Dilma pk Identity");
			ChavePrimariaSEQUENCE chavePrimariaSEQUENCE = new ChavePrimariaSEQUENCE(
					"Marina pk Sequence");
			ChavePrimariaTABLE chavePrimariaTABLE = new ChavePrimariaTABLE(
					"Luciana pk Table");
			ChavePrimariaTABLEdois chavePrimariaTABLEdois = new ChavePrimariaTABLEdois(
					"Pastor Everaldo pk Table");

			fabrica.getTransaction().begin();
			
			fabrica.persist(chavePrimariaAUTO);
			fabrica.persist(chavePrimariaSEQUENCE);
			fabrica.persist(chavePrimariaIDENTITY);
			fabrica.persist(chavePrimariaTABLE);
			fabrica.persist(chavePrimariaTABLEdois);
			
			fabrica.getTransaction().commit();

			fabrica.close();
			factory.close();

		} catch (Exception e) {
			System.out.println("ERRO--->>\n");
			e.printStackTrace();
		}

	}
}
