package Seleccion_menu_pizzas;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class Procesando_pedido implements JavaDelegate{

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		// TODO Auto-generated method stub
	    String gaseosa = (String) execution.getVariable("gaseosa");
	    String pizza = (String) execution.getVariable("comida");
		if (gaseosa.equals("coca cola") || (gaseosa.equals("sprite"))) {
			System.out.println("El cliente compró una pizza de "+pizza+ " y una gaseosa "+gaseosa);
		}
		else {
			System.out.println("El cliente hizo una compra de una pizza de "+pizza + "pero no de una geseosa");
		}
	}

}
