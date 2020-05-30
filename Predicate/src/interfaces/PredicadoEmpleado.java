package interfaces;

import pojo.Empleado;

@FunctionalInterface
public interface PredicadoEmpleado {
	
	boolean probar(Empleado e);

}
