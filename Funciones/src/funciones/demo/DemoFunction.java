package funciones.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

import funciones.pojo.Empleado;

public class DemoFunction {

	public static void main(String[] args) {

		Function<String,Integer> fun1 = y -> y.length();
		int longitud = fun1.apply("Hola Mundo");
		System.out.println(longitud);
		
		Function<Empleado,String> fun2 = z -> z.getNombre();
		Empleado empleado = new Empleado("Patrobas",28,56.79);
		System.out.println(fun2.apply(empleado));
		
		Function<String,String> fun3 = x -> x + "Mundo";
		System.out.println(fun3.apply("Hola "));
		
		UnaryOperator<String> uo1 = z -> z + "Mundo";
		System.out.println(uo1.apply("Hola "));
		
		System.out.println("-------------");
		List<Empleado> listaEmpleados = new ArrayList<>();
		listaEmpleados.add(new Empleado("Patrobas",28,45.67));
		listaEmpleados.add(new Empleado("Tercio",35,56.67));
		listaEmpleados.add(new Empleado("Andronico",19,40.50));
		listaEmpleados.add(new Empleado("Rolas",17,10.03));
		
		UnaryOperator<Empleado> uo2 = x-> {
			x.setSueldo(x.getSueldo() * 1.10);
			return x;
		};
		
		listaEmpleados.replaceAll(uo2);
		listaEmpleados.forEach(x -> System.out.println(x));
		
	}

	
	
	
	
}
