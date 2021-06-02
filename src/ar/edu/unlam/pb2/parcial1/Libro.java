package ar.edu.unlam.pb2.parcial1;

public class Libro {
	
	protected Integer codigo;
	protected String nombre;
	protected String autor;
	private Boolean fotocopiable;
	private TipoDeLibro tipoDeLibro;
	
	
	public Libro(Integer codigo, String nombre, String autor, TipoDeLibro tipoDeLibro) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.autor = autor;
		this.tipoDeLibro = tipoDeLibro;
	}


	public TipoDeLibro getTipoDeLibro() {
		return tipoDeLibro;
	}


	public void setTipoDeLibro(TipoDeLibro tipoDeLibro) {
		this.tipoDeLibro = tipoDeLibro;
	}


	public Integer getCodigo() {
		return codigo;
	}


	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getAutor() {
		return autor;
	}


	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	
	public Boolean esFotocopiable() {
		Boolean fotocopiable = false;
		switch(tipoDeLibro) {
	      case HISTORIA:
	    	  fotocopiable = true;
	        break;
	      case GEOGRAFIA:
	    	  fotocopiable = true;
	        break;
	      case MATEMATICA:
	    	  fotocopiable = false;
	        break;
	    }
		return fotocopiable;
		
	}
	
	
	

}
