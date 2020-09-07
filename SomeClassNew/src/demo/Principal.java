package demo;

import java.util.*;
import java.util.function.*;

public class Principal {

	public static void main(String[] args) {

		//Supplier<Persona> supPer = () -> new Persona();
		Supplier<Persona> supPer = Persona::new;
		Persona persona = supPer.get();
		System.out.println(persona);
		
		System.out.println("----------");
		
		//Function<Integer,Persona> funPer = x -> new Persona(x);
		Function<Integer,Persona> funPer = Persona::new;
		Persona personaFun = funPer.apply(20);
		System.out.println(personaFun);
		
		System.out.println("----------");

		//BiFunction<Integer,String,Persona> biFunPer = 
		//		(x,y) -> new Persona(x,y);
		BiFunction<Integer,String,Persona> biFunPer = Persona::new;
		System.out.println(biFunPer.apply(50, "Patrobas"));
		System.out.println("----------");

		Supplier<List<Double>> supLista = ArrayList<Double>::new;
		List<Double> lista = supLista.get();
		System.out.println(lista);
		System.out.println("----------");

		Function<String, Integer> fun = Integer::new;
		Integer i = fun.apply("8");
		System.out.println(i);
		
		System.out.println("----------");
		BiFunction<String,String, Locale> locBiFun = Locale::new;
		Locale loc = locBiFun.apply("en", "UK");
		System.out.println(loc);
	}

}






