package funcional;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import funcional.pojo.Empleado;

public class PrincipalLambdas {

	public static void main(String[] args) {
		List<Empleado> listaEmpleados = new ArrayList<>();
		listaEmpleados.add(new Empleado("Patrobas",28,45.67));
		listaEmpleados.add(new Empleado("Tercio",35,56.67));
		listaEmpleados.add(new Empleado("Andronico",19,40.50));
		listaEmpleados.add(new Empleado("Rolas",17,10.03));
		
		Comparator<Empleado> compNombre = (o1, o2) 
				-> o1.getNombre().compareTo(o2.getNombre());
		
		System.out.println("ListaEmpleados por Nombre con Lambdas");
		Collections.sort(listaEmpleados, compNombre);
		for (Empleado e:listaEmpleados) System.out.println(e);
		
		System.out.println("ListaEmpleados por Edad con Lambdas");
		Collections.sort(listaEmpleados,  (o1,o2) -> o1.getEdad() - o2.getEdad() );
		for (Empleado e:listaEmpleados) System.out.println(e);
		
		System.out.println("ListaEmpleados por Sueldo con Lambdas");
		Collections.sort(listaEmpleados,  (o1,o2) -> (int)(o1.getSueldo() - o2.getSueldo()) );
		for (Empleado e:listaEmpleados) System.out.println(e);	
	}
	
}
