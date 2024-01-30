package diegoxyz;

import java.util.List;
import java.util.Scanner;

import dto.*;
import facade.Facade;

public class App {

	public static void main(String[] args) {
		
		//instancio el Facade
		Facade f = new Facade();
		
		//muestro la pantalla de inscripcion
		_mostrarPantallaInsc(f);
		
		//ingreso de datos
		InscripcionDTO dto = _ingresoDatos();
		
		
		//proceso la inscripcion
		//corregir este metodo en el libro
		int idInsc = f.registrarInscripcion(dto);
		
		//muestro pantalla de confirmacion
		_mostrarPantallaConfirm(idInsc);
		
		
	}

	
	private static void _mostrarPantallaConfirm(int idInsc) {
		System.out.println("INSCRITO AL CURSO");
		System.out.println("SU CODIGO DE INSCRIPCION ES: " + idInsc);
		
	}

	
	private static InscripcionDTO _ingresoDatos() {
		//con Scanner ingro datos por teclado
		Scanner scanner = new Scanner(System.in);
		
		//ingrese su nombre
		System.out.println("Ingrese su nombre: ");
		String nom = scanner.next();
		
		System.out.println("Ingrese su telefono: ");
		String tel = scanner.next();
		
		System.out.println("Ingrese el codigo de curso: ");
		int idCurso = scanner.nextInt();
		
		System.out.println("Ingrese el codigo de forma pago: ");
		int idFromaPago = scanner.nextInt();
		
		//instancio el dto que debo retornar
		InscripcionDTO dto  = new InscripcionDTO();
		
		dto.setNombre(nom);
		dto.setTelefono(tel);
		dto.setIdCurso(idCurso);
		dto.setIdFormaPago(idFromaPago);
		
		return dto;
		
	}

	
	private static void _mostrarPantallaInsc(Facade f) {
		//obtengo la lista de cursos
		List<CursoDTO> cursos = f.obtenerCursos();
		System.out.println("Ya traje los resultados de los cursos");
		
		// obtengo la lista de formas de pago
		List<FormaPagoDTO> formasPago = f.obtenerFormasPago();
		System.out.println("Ya traje los resultados de las Formas de Pago");
		
		System.out.println("-- CURSOS --");
		for (CursoDTO dto: cursos) {
			// muestro codigo de curso y descripcion
			System.out.print(dto.getIdCurso() + " - ");
			System.out.println(dto.getDescripcion());
			
		}
		
		System.out.println("-- FROMAS DE PAGO --");
		for (FormaPagoDTO dto: formasPago) {
			// codigo de forma de pago y descripcion
			System.out.print(dto.getIdFromaPago() + " - ");
			System.out.println(dto.getDescripcion());
			
		}
		
	}
	
	
}




