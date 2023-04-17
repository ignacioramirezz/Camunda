package Vuelto_de_dinero;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class Prueba implements JavaDelegate {

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		// TODO Auto-generated method stub
	    int plata = (int)execution.getVariable("dinero");
	    System.out.println("La variable llamada dinero tiene el siguiente valor: "+ plata);
	    execution.setVariable("vuelto",plata-90);
	    int vuelto = (int) execution.getVariable("vuelto");
	    System.out.println("Se ha creado una nueva variable llamado VUELTO cuyo valor es: "+ vuelto);
	    System.out.println("Finalizacion de operacion");
	}

}
