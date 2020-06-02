package clientes;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import pojo.Empleado;

public class Principal6 {

	public static void main(String[] args) {
			List<Empleado> listaEmpleados = new ArrayList<>();
			listaEmpleados.add(new Empleado("Patrobas",28,45.67));
			listaEmpleados.add(new Empleado("Tercio",35,56.67));
			listaEmpleados.add(new Empleado("Andronico",19,40.50));
			listaEmpleados.add(new Empleado("Rolas",17,10.03));
			
			//EDAD MAYOR A 20
			Predicate<Empleado> p = x -> x.getEdad() > 20;
			mostrar(listaEmpleados, p.negate());
			
			Predicate<Empleado> sp = x -> x.getSueldo()>25;
			//EDAD MAYOR A 20 Y SUELDO MAYOR A 25
			mostrar(listaEmpleados, p.and(sp));
			
			////EDAD MAYOR A 20 O SUELDO MAYOR A 25
			mostrar(listaEmpleados, p.or(sp));
			
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









