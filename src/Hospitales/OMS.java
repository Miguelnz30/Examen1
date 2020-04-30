package Hospitales;
import java.util.ArrayList;

import Component.Paciente;
import Component.Hospital;

public abstract class OMS {
	ArrayList<Paciente> persona = new ArrayList<Paciente>();
	public OMS(ArrayList<Paciente> persona) {
		this.persona=persona;
	}
	abstract protected boolean isGamHospital() ;
	abstract Hospital getNombreHospital();
	 private void diagnosticar() {
		
	 }
	
}
