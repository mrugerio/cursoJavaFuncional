package funciones.demo;

import java.util.List;
import java.util.ArrayList;
import java.util.function.Consumer;

import funciones.pojo.Empleado;

public class DemoConsumer {

	public static void main(String[] args) {

		Consumer<String> con1 = y -> System.out.println(y);
		con1.accept("Hola Mundo");
		
		Consumer<Empleado> con2 = z -> System.out.println(z);
		con2.accept(new Empleado("Mary",20,56.79));
		
		System.out.println("-------------");
		List<Empleado> listaEmpleados = new ArrayList<>();
		listaEmpleados.add(new Empleado("Patrobas",28,45.67));
		listaEmpleados.add(new Empleado("Tercio",35,56.67));
		listaEmpleados.add(new Empleado("Andronico",19,40.50));
		listaEmpleados.add(new Empleado("Rolas",17,10.03));
		
		listaEmpleados.forEach(x -> System.out.println(x));
		
	}

}
