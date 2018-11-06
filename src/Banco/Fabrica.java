package Banco;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Fabrica {

	private static EntityManagerFactory fabrica;
	
	public static EntityManagerFactory get() {
		
		if(fabrica == null) {
			fabrica = Persistence.createEntityManagerFactory("meu_comercial");
		}
		return fabrica;
	}
}
