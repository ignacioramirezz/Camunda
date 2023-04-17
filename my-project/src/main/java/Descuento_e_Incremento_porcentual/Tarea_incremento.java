package Descuento_e_Incremento_porcentual;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class Tarea_incremento implements JavaDelegate {

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		int porcentaje_aplicado = (int)execution.getVariable("porcentaje"); // En este caso quiero realizar un incremento del 10% ante la variable ingresada en el formulario por el mismo usuario
		System.out.println("Realizando descuento de dinero del "+ porcentaje_aplicado );	
		int dinero_ingresado = (int)execution.getVariable("dinero");
		int descuento = (((int)execution.getVariable("dinero") * porcentaje_aplicado))/100;
		execution.setVariable("dinero",dinero_ingresado + descuento);
		System.out.println("La ejecucion de descuento a finalizado con el valor DINERO ya modificado  -->  " + execution.getVariable("dinero"));
	}	
}
	


