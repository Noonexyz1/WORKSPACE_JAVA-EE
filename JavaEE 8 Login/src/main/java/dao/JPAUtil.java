package dao;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {
	
	private static final String NOMBRE_UNIDAD_DE_PERSISTENCIA = "PERSISTENCIA";
	private static EntityManagerFactory fabricaManejadorEntidades;
	
	public static EntityManagerFactory getFabricaManejadorEntidades() {
		if (fabricaManejadorEntidades == null) {
			fabricaManejadorEntidades = Persistence.createEntityManagerFactory(NOMBRE_UNIDAD_DE_PERSISTENCIA);

		}
		
		return fabricaManejadorEntidades;
	}
	
	
	public static void cerrar() {
		if (fabricaManejadorEntidades != null) {
			fabricaManejadorEntidades.close();
			
		}
		
	}
	
	
}
