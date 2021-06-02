package ar.edu.unlam.pb2.parcial1;

public class Prestamo {

	private Integer id;
	private Estudiante estudiante;
	private Libro libro;
	
	
	public Prestamo(Integer id, Estudiante estudiante, Libro libro) {
		super();
		this.id = id;
		this.estudiante = estudiante;
		this.libro = libro;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public Estudiante getEstudiante() {
		return estudiante;
	}


	public void setEstudiante(Estudiante estudiante) {
		this.estudiante = estudiante;
	}


	public Libro getLibro() {
		return libro;
	}


	public void setLibro(Libro libro) {
		this.libro = libro;
	}
	
	
	
	
}
