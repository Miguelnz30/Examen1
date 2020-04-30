package Component;

public enum Hospital {
	Nicoya("Hospital de Nicoya"), Mexico("Hospital de Mexico");
	private String nombre;
	
	
	private Hospital (String nombre){
		this.nombre = nombre;
		
	}

	public String getNombre() {
		return nombre;
	}

	
}
