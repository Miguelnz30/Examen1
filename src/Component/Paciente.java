package Component;

public final class Paciente {
	private final String nombre;
	private final int edad;
	private final int temperatura;
	private final boolean vomito;
	
	public Paciente(String  nombre, int edad, int temperatura, boolean vomito) {
		this.nombre=nombre;
		this.edad=edad;
		this.temperatura=temperatura;
		this.vomito=vomito;
	}
	public String getNombre() {
		return nombre;
	}
	public int getEdad() {
		return edad;
	}
	public int getTemperatura() {
		return temperatura;
	}
	public boolean getVomito() {
		return vomito;
	}

}
