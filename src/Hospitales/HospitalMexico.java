package Hospitales;

import java.util.ArrayList;

import Component.Hospital;
import Component.Paciente;

public class HospitalMexico extends OMS{

	public HospitalMexico(ArrayList<Paciente> persona) {
		super(persona);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected boolean isGamHospital() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	Hospital getNombreHospital() {
		// TODO Auto-generated method stub
		return null;
	}

}
