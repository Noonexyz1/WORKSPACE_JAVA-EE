import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

public class Principal{

	public static void main(String[] args) {
		int[] vector = new int[10];
		iniciarPrograma(vector);
		
	}
	//iniciamos el programa
	public static void iniciarPrograma(int[] vector) {
		System.out.println("");
		int valor = 0;
		
		
		//lanzamos el programa
		lanzarMenu();
		valor = ingresarOpcion();
		valor = validarOpcion(valor);
		ejecutarLaOpcion(valor, vector);
		
	}
	
	//Este metodo lanza el programa con el menu dentro
	public static void lanzarMenu() {
		System.out.println("Ingrese un una Opcion Numerica:");
		System.out.println("1) Calcular IVA, IT.");
		System.out.println("2) Introducir el nombre del Producto/Precio.");
		System.out.println("3) Calculadora Basica.");
		System.out.println("4) Carga de Vector.");
		System.out.println("5) Cargar Matriz de 3 Dimenciones.");
		System.out.println("6) Mostrar vector/Ordenado Asc.");
		System.out.println("7) Buscar valor vector.");
		System.out.println("8) Hallar Division.");
		System.out.println("123) Salir.");
			
	}

	//Este metodo retorna el valor ingresado por el teclado
	public static int ingresarOpcion() {
		int valor;
		Scanner teclado = new Scanner(System.in);
		valor = teclado.nextInt(); 
		return valor;
		
	}
	
	//Este metodo retorna el valor ingresado por el teclado STRING
	public static String ingresarTexto() {
		String valor;
		Scanner teclado = new Scanner(System.in);
		valor = teclado.next(); 
		return valor;
		
	}
	
	//llenar un vector con precios enteros
	public static void llenarVector(int[] vector, int tam) {
		int valor = 0;
		for(int i = 0; i < tam; i++) {
			System.out.println("Ingrese el precio " + (i + 1) +" :");
			valor = ingresarOpcion();
			valor = validarCantidad(valor);
			vector[i] = valor;
			
		}
		
	}
	
	//llenar un vector con precios enteros
	public static void llenarVectorAleatorio(int[] vector, int tam) {
		for(int i = 0; i < tam; i++) {
			vector[i] = (int)(Math.random()*100+1);
		
		}
		
	}
	
	//mostrar el vector
	public static void mostrarVector(int[] vector, int tam) {
		for(int i = 0; i < tam; i++) {
			System.out.print("[" + vector[i] + "]");
			
		}
		System.out.println("");
		
	}
	
	//mostrar el valor mayor de un vector
	public static int mayorEleVector(int[] vector, int tam) {
		int mayor = 0;
		for (int i = 0; i < tam; i++) {
			if (vector[i] > mayor ) {
				mayor = vector[i];
			}
			
		}
		
		return mayor;
		
	}
	
	//verificando si el vector esta lleno
	public static boolean verificarVecLleno(int[] vector) {
		boolean estaLleno = false;
		if(vector[0] != 0 && vector[9] != 0) {
			estaLleno = true;
			
		}
		
		return estaLleno;
		
	}
	
	//ordenar Ascendentemente un vector siempre y cuando este lleno
	public static void ordenarVectorAsc(int[] vector, int tam, boolean estaLleno) {
		if (estaLleno == false) {
			llenarVectorAleatorio(vector, tam);
			mostrarVector(vector, tam);
			
		}
		
		//aqui ordenar el vector
		int aux = 0;
        for (int i = 0; i < tam - 1; i++) {
            for (int j = 0; j < tam - i - 1; j++) {
                if (vector[j + 1] < vector[j]) {
                    aux = vector[j + 1];
                    vector[j + 1] = vector[j];
                    vector[j] = aux;
                }
            }
        }
		
	}
	
	//buscar en el vector un valor ingresado
	public static void buscarEnVector(int[] vector, int tam, boolean estaLleno, int valor) {
		int bandera = 0;
		if (estaLleno == false) {
			llenarVectorAleatorio(vector, tam);
			ordenarVectorAsc(vector, tam, estaLleno);
			mostrarVector(vector, tam);
			
		}
		
		//buscar en el vector
		for(int i = 0; i < tam; i++) {
			if(valor == vector[i]) {
				bandera = 1;
				
			}
			
		}
		
		if (bandera == 1) {
			System.out.println("El valor EXISTE en el vector.");
			
		} else {
			System.out.println("El valor NO EXISTE en el vector.");
			
		}
		
		
	}
	
	
	//Este metodo valida el valor de ingreso que ingresa el usuario
	//ya sea mayor a 0 o si el valor es 123
	public static int validarOpcion(int valor) {
		int valorRetorno = 0;
		if ((0 < valor && valor < 9) || valor == 123) {
			valorRetorno = valor;
		
		} else {
			System.out.println("Por favor ingrese un valor admitido:");
			lanzarMenu();
			valorRetorno = ingresarOpcion();
			valorRetorno = validarOpcion(valorRetorno);
			
		}
		
		return valorRetorno;
		
	}
	
	
	//Se ejecuta una opcion de acuerdo al envidado por argumento
	public static void ejecutarLaOpcion(int valor, int[] vector) {
		
		/* Aqui tenia el error de declarar int[] vector = new int[tam] 
		 * y cada vez vez que volvia a iniciar el programar en cada una de las
		 * opciones, se reseteaba a valores iniciales y, por eso me daba
		 * conflictos con la opcion 4 y 6 donde se rompia las reglas del negocio.
		 * Se soluciona este problema haciendo el ajuste en el metodo main()
		 * :)
		 * */
		
		switch (valor) {
		case 1:
			int cantidad = 0;
			System.out.println("Ingrese cantidad: ");
			cantidad = ingresarOpcion();
			cantidad = validarCantidad(cantidad);
			calcularIvaIt(cantidad);
			iniciarPrograma(vector);
			break;
			
		case 2:
			String texto = "";
			int[] precios = new int[5];
			int precioMayor = 0;
			
			System.out.println("Ingrese el nombre del producto");
			texto = ingresarTexto();
			llenarVector(precios, 5);
			
			mostrarVector(precios, 5);
			
			precioMayor = mayorEleVector(precios, 5);
			
			System.out.println("El nombre del producto es: " + texto);
			System.out.println("El precio mayor del producto es: " + precioMayor);
			
			iniciarPrograma(vector);	
			break;
			
		case 3:
			int valor1 = 0;
			int valor2 = 0;
			
			System.out.println("Ingrese valor 1: ");
			valor1 = ingresarOpcion();
			valor1 = validarCantidad(valor1);
			System.out.println("Ingrese valor 2: ");
			valor2 = ingresarOpcion();
			valor2 = validarCantidad(valor2);
			operaciones(valor1, valor2);

			iniciarPrograma(vector);
			break;
			
		case 4:
			llenarVectorAleatorio(vector, 10);
			mostrarVector(vector, 10);
			
			iniciarPrograma(vector);
			break;
			
		case 5:
			System.out.println("cargarMatrices()");
			break;
			
		case 6:
			boolean estaLleno = false;
			mostrarVector(vector, 10);
			estaLleno = verificarVecLleno(vector);
			ordenarVectorAsc(vector, 10, estaLleno);
			mostrarVector(vector, 10);
			
			iniciarPrograma(vector);
			break;
			
		case 7:
			int valorUno = 0;
			boolean estaLlenoUno = false;
			
			System.out.println("Ingrese el valor a Buscar de 1 a 100.");
			mostrarVector(vector, 10);
			valorUno = ingresarOpcion(); 
			estaLlenoUno = verificarVecLleno(vector);
			buscarEnVector(vector, 10, estaLlenoUno, valorUno);
			
			iniciarPrograma(vector);
			break;
			
		case 8:
			System.out.println("divisionEntera()");
			break;
			
		default:
			System.out.println("Fin del Programa...");
			break;
			
		}
		
	}
	
	
	
	//metodos auxiliares
	public static int validarCantidad(int cantidad) {
		int cantidadValid = 0;
		if (0 <= cantidad) {
			cantidadValid = cantidad;
		} else {
			System.out.println("Ingrese una valor positivo:");
			cantidadValid = ingresarOpcion();
			cantidadValid = validarCantidad(cantidadValid);
			
		}
		
		return cantidadValid;
	}
	
	
	//Implementando los metodos del menu
	public static void calcularIvaIt(double cantidad) {
		double it = 0;
		double iva = 0;
		
		it = cantidad * 0.03;
		iva = cantidad * 0.13;
		
		System.out.println("El impuesto a la transferencia es: " + it + "Bs");
		System.out.println("El impuesto al valor agregado es: " + iva + "Bs");
		
	}

	public static void operaciones(int num1, int num2) {
		int suma = 0;
		int resta = 0;
		int producto = 0;
		int divEntera = 0;
		int modulo = 0;
		double divReal = 0;
		
		suma = num1 + num2;
		resta = num1 - num2;
		producto = num1 * num2;
		divEntera = num1 / num2;
		modulo = num1 % num2;
		divReal = num1 / (num2 + 0.00);
		
		System.out.println("La suma es: " + suma);
		System.out.println("La resta es: " + resta);
		System.out.println("La producto es: " + producto);
		System.out.println("La divEntera es: " + divEntera);
		System.out.println("La modulo es: " + modulo);
		System.out.println("La divReal es: " + divReal);
	
	}
	
	
	//Este metodo retorna un valor entre un minimo y un maximo
	public static int validarValores(int min, int max) {
		int valor;
		do {
			valor = ingresarOpcion();
		} while (min > valor && max < valor );
		
		return valor; 
		
	}

	
}
