package Seleccion_menu_pizzas;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class Error_menu implements JavaDelegate {

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		// TODO Auto-generated method stub
		System.out.println(" ¡ERROR! El cliente no ha ingresa ningun menu de los que brindamos en la pizzeria!!!");
	}

}
