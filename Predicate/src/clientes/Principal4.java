package clientes;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import pojo.Empleado;

public class Principal4 {

	public static void main(String[] args) {
			List<Empleado> listaEmpleados = new ArrayList<>();
			listaEmpleados.add(new Empleado("Patrobas",28,45.67));
			listaEmpleados.add(new Empleado("Tercio",35,56.67));
			listaEmpleados.add(new Empleado("Andronico",19,40.50));
			listaEmpleados.add(new Empleado("Rolas",17,10.03));
			
			Predicate<Empleado> p = x -> x.getEdad() > 20;
			System.out.println("Predicate");
			mostrar(listaEmpleados, p);
			mostrar(listaEmpleados, x -> x.getSueldo()>25);
			mostrar(listaEmpleados, x -> x.getNombre().length()>6);
			
	}
	
	static void mostrar(List<Empleado> lista, Predicate<Empleado> p) {
		for (Empleado e: lista) {
			if(p.test(e)) {
				System.out.println(e);
			}
		}	
		System.out.println("------------------------");
	}
}









