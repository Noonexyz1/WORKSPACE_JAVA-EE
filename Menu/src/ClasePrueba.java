
public class ClasePrueba {

	
	public static void main(String[] args) {
	
		int[] vector = new int[] {1, 2};
		buscarEnVector(vector, 2, false, 12);
		
	}
	
	public static void buscarEnVector(int[] vector, int tam, boolean estaLleno, int valor) {
		int bandera = 0;
		
		
		//buscar en el vector
		for(int i = 0; i < tam; i++) {
			if(valor == vector[i]) {
				bandera = 1;
				
			} else {
				bandera = 0;
			}
			
		}
		
		if (bandera == 1) {
			System.out.println("El valor EXISTE en el vector.");
			
		} else {
			System.out.println("El valor NO EXISTE en el vector.");
			
		}
		
		
	}
	
}
