package TipoPruebaCovid;
import Component.PruebaCovid19;
import Component.Paciente;
public final class PruebaRapida implements PruebaCovid19 {
	public final Paciente paciente;
	
 public PruebaRapida(Paciente paciente) {
	 this.paciente=paciente;
	 
 }

@Override
public boolean isPositiveCase() {
	
	
	if(paciente.getTemperatura()>=37 && paciente.getVomito()==true) {
		System.out.print("positivo");
		return true;
	}else {
		System.out.print("positivo");
		return false;
	}
	}
	

@Override
public String getNombrePaciente() {
	// TODO Auto-generated method stub
	return null;
}

}
