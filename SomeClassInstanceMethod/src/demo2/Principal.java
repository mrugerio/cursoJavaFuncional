package demo2;

import java.util.function.BiPredicate;
import java.util.function.BiFunction;

public class Principal {
	
	public static void main(String[] args) {
		
		Principal principal = new Principal();
		//BiFunction<Principal,String,Integer> biFuncion = 
		//		(p,s) -> p.getCantLetras(s);
		BiFunction<Principal,String,Integer> biFuncion = Principal::getCantLetras;				
		System.out.println(biFuncion.apply(principal,"Hello World Java"));
		
		TriPredicate<Principal,Integer,Integer> TriPred = Principal::esMayor10;		
		System.out.println(TriPred.test(principal,5, 7));
	}

	int getCantLetras(String s) {
		return s.length();
	}
	
	boolean esMayor10(int x, int y) {
		return (x+y) > 10;
	}
}
