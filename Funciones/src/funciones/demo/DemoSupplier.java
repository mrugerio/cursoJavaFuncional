package funciones.demo;

import java.util.function.Supplier;

import funciones.pojo.Empleado;

public class DemoSupplier {

	public static void main(String[] args) {

		Supplier<String> sup1 = () -> "Hola Mundo";
		String cadena = sup1.get();
		System.out.println(cadena);
		
		Supplier<Empleado> sup2 = () -> new Empleado("Patrobas",30,78.89);
		Empleado emp = sup2.get();
		System.out.println(emp);
		
		Supplier<Double> randomValor = () -> Math.random();
		System.out.println(randomValor.get());
		
	}

}
