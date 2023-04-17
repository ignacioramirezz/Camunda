package Turismo;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class Destino_cordoba implements JavaDelegate{

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		// TODO Auto-generated method stub
		
		String destino = (String)execution.getVariable("localidad");
		
		System.out.println("La localidad que ingreso el usuario es valido para la oferta de destino que tiene la empresa");
		

		if (destino.equals("Buenos Aires"))
			System.out.println("El destino final para "+ destino +" sera Mar del Plata y Tandil como posibilidades");
		
		if (destino.equals("Cordoba"))
			System.out.println("El destino final para "+ destino +" sera Villa General Belgrano");
	}
}
