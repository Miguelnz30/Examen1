package TipoPruebaCovid;

import Component.Paciente;
import Component.PruebaCovid19;


public final class TecnicaPCR implements PruebaCovid19 {
	
public final Paciente paciente;
	
 public TecnicaPCR(Paciente paciente) {
	 this.paciente=paciente;
	 
 }

@Override
public boolean isPositiveCase() {
	if(paciente.getTemperatura()>=39 && paciente.getVomito()==true) {
		System.out.print("positivo");
		return true;
	}else {
		System.out.print("negativo");
		return false;
	}
	
}

@Override
public String getNombrePaciente() {
	// TODO Auto-generated method stub
	return null;
}


}
