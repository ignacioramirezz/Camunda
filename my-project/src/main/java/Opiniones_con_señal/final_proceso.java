package Opiniones_con_señal;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class final_proceso implements JavaDelegate{

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		// TODO Auto-generated method stub
		String estado_final = (String) execution.getVariable("estado");
		System.out.println(estado_final);
	}

}
