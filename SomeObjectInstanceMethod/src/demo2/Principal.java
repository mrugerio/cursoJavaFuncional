package demo2;

import java.util.function.BiPredicate;
import java.util.function.Function;

public class Principal {
	
	public static void main(String[] args) {
		
		Principal principal = new Principal();
		//Function<String,Integer> funcion = 
		//		s -> principal.getCantLetras(s);
		Function<String,Integer> funcion = principal::getCantLetras;				
		System.out.println(funcion.apply("Hello Java"));
		
		//BiPredicate<Integer,Integer> biPred =
				//(x,y) -> principal.esMayor10(x, y);
		BiPredicate<Integer,Integer> biPred = principal::esMayor10;		
		System.out.println(biPred.test(5, 2));
	}

	int getCantLetras(String s) {
		return s.length();
	}
	
	boolean esMayor10(int x, int y) {
		return (x+y) > 10;
	}
}
