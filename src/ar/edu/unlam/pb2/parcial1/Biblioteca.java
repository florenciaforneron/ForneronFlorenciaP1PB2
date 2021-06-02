package ar.edu.unlam.pb2.parcial1;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
	
	List<Libro> libros = new ArrayList<Libro>();
	List<Prestamo> registroDePrestamos = new ArrayList<Prestamo>();
	
	public Biblioteca() {
		
	}
		
	public void agregarLibro(Libro libro) {
		libros.add(libro);		
	}
	
	public void prestarLibro(Libro libro) {
		
			 libros.remove(libro);
		
	}

	public void imprimirLibro(Libro libro) {
		if (libro.esFotocopiable() == true) {
			if (libro.getTipoDeLibro().equals(TipoDeLibro.HISTORIA)) {
				System.out.println("Soy un libro de Historia y me imprimo");
			} else {
				System.out.println("Soy un libro de geografia y me imprimo");
			}

		}else {
			System.out.println("No se pueden imprimir libros de Matematica");
		}
		;
	}
}
