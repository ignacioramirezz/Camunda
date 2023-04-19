package Reparacion_celular;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class EnvioMensajeSocio implements JavaDelegate {

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		// TODO Auto-generated method stub
		String notificacion = (String) execution.getVariable("estado");
		
		execution.getProcessEngineServices().getRuntimeService().createMessageCorrelation("PedirAyudaSocio").setVariable("correo", notificacion).correlate();
	}
}
