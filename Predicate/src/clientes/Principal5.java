package clientes;

import java.util.ArrayList;
import java.util.List;

import interfaces.Predicado;
import pojo.Empleado;

public class Principal5 {

	public static void main(String[] args) {
			List<Empleado> listaEmpleados = new ArrayList<>();
			listaEmpleados.add(new Empleado("Patrobas",28,45.67));
			listaEmpleados.add(new Empleado("Tercio",35,56.67));
			listaEmpleados.add(new Empleado("Andronico",19,40.50));
			listaEmpleados.add(new Empleado("Rolas",17,10.03));
			
			Predicado<Empleado> p = x -> x.getEdad() > 20;
			//EDAD MENOR O IGUAL A 20
			//Predicado<Empleado> np = Predicado.negate(p);
			//Predicado<Empleado> np = p.negate();
			//mostrar(listaEmpleados, np);
			mostrar(listaEmpleados, p.negate());
			
			Predicado<Empleado> sp = x -> x.getSueldo()>25;
			//EDAD MAYOR A 20 Y SUELDO MAYOR A 25
			//Predicado<Empleado> pre = Predicado.and(p, sp);
			//Predicado<Empleado> pre = p.and(sp);
			//mostrar(listaEmpleados, pre);
			mostrar(listaEmpleados, p.and(sp));
			
			////EDAD MAYOR A 20 O SUELDO MAYOR A 25
			//pre = Predicado.or(p, sp);
			//pre = p.or(sp);
			//mostrar(listaEmpleados, pre);
			mostrar(listaEmpleados, p.or(sp));
			
			
			/*Predicado.probarStatic();
			
			Predicado<Empleado> p = x -> x.getEdad() > 20;
			p.probarDefault();
			
			Predicado<Empleado> r = Predicado.returnPredicate();*/
			
			/*
			mostrar(listaEmpleados, p);
			mostrar(listaEmpleados, x -> x.getSueldo()>25);
			mostrar(listaEmpleados, x -> x.getNombre().length()>6);*/
			
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









