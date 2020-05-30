package clientes;

import java.util.ArrayList;
import java.util.List;

import interfaces.PredicadoEmpleado;
import pojo.Empleado;

public class Principal {

	public static void main(String[] args) {
			List<Empleado> listaEmpleados = new ArrayList<>();
			listaEmpleados.add(new Empleado("Patrobas",28,45.67));
			listaEmpleados.add(new Empleado("Tercio",35,56.67));
			listaEmpleados.add(new Empleado("Andronico",19,40.50));
			listaEmpleados.add(new Empleado("Rolas",17,10.03));
			
			//Empleados mayores a 20 años.
			/*PredicadoEmpleado p = new PredicadoEmpleado() {
				@Override
				public boolean probar(Empleado e) {
					return e.getEdad()>20;
				}
			};*/
			
			PredicadoEmpleado p = x -> x.getEdad() > 20;
			
			//boolean resultado = p.probar(listaEmpleados.get(0));
			//System.out.println(resultado);
			
			for (Empleado e : listaEmpleados) {
				if (p.probar(e)) {
					System.out.println(e);
				}
			}
			
	}
}









