package ar.edu.unlam.pb2.parcial1;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class BibliotecaTest {

	@Test
	public void testQueSeAgregueUnLibro() {
		TipoDeLibro tipo = TipoDeLibro.HISTORIA;
		Libro libro = new Libro(1,"Libro 1", "Juan Perez", tipo);
		List<Libro> listaDeLibros = new ArrayList<Libro>();
		listaDeLibros.add(libro);
		Integer esperado = 1;
		Integer obtenido = listaDeLibros.size();
		
		assertEquals(esperado, obtenido);
	}
/*	
	@Test
	public void testQueSePuedaPrestarUnLibro() {
		Biblioteca biblioteca = new Biblioteca();
		TipoDeLibro tipo = TipoDeLibro.HISTORIA;
		Libro libro = new Libro(1,"Libro 1", "Juan Perez", tipo);
		List<Libro> listaDeLibros = new ArrayList<Libro>();
		Libro libro2 = new Libro(2, "Libro 2", "Pepito Lopez", tipo);
		listaDeLibros.add(libro);
		listaDeLibros.add(libro2);
		biblioteca.prestarLibro(libro);
		
		Integer esperado = 1;
		Integer obtenido = listaDeLibros.size();
		System.out.println(listaDeLibros.size());
		
		assertEquals(esperado, obtenido);
		
	}
	
*/	
	

}
