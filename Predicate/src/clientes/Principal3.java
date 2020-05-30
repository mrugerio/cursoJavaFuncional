package clientes;

import java.util.ArrayList;
import java.util.List;

import interfaces.Predicado;
import pojo.Empleado;

public class Principal3 {

	public static void main(String[] args) {
			List<Empleado> listaEmpleados = new ArrayList<>();
			listaEmpleados.add(new Empleado("Patrobas",28,45.67));
			listaEmpleados.add(new Empleado("Tercio",35,56.67));
			listaEmpleados.add(new Empleado("Andronico",19,40.50));
			listaEmpleados.add(new Empleado("Rolas",17,10.03));
			
			Predicado<Empleado> p = x -> x.getEdad() > 20;
			System.out.println("Predicado con Generics");
			mostrar(listaEmpleados, p);
			mostrar(listaEmpleados, x -> x.getSueldo()>25);
			mostrar(listaEmpleados, x -> x.getNombre().length()>6);
			
	}
	
	static void mostrar(List<Empleado> lista, Predicado<Empleado> p) {
		for (Empleado e: lista) {
			if(p.probar(e)) {
				System.out.println(e);
			}
		}	
		System.out.println("------------------------");
	}
}









