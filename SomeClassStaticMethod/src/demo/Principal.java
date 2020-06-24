package demo;

import java.util.function.*;

public class Principal {

	public static void main(String[] args) {
		
		/*BiPredicate<Integer,Integer> esMas10 =
				(x,y) -> Numeros.esMasDe10(x, y);
		boolean resultado = esMas10.test(5, 4);
		System.out.println("esMas10.test(5, 4): "+resultado);
		resultado = esMas10.test(6, 7);
		System.out.println("esMas10.test(6, 7): "+resultado);*/

		BiPredicate<Integer,Integer> esMas10 = Numeros::esMasDe10;
		boolean resultado = esMas10.test(5, 4);
		System.out.println("esMas10.test(5, 4): "+resultado);
		resultado = esMas10.test(6, 7);
		System.out.println("esMas10.test(6, 7): "+resultado);
		
		System.out.println("--------------");
		
		/*UnaryOperator<String> uoString = z -> Util.hacerExcitante(z);
		String res = uoString.apply("Java");
		System.out.println(res);
		*/
		
		UnaryOperator<String> uoString = Util::hacerExcitante;
		String res = uoString.apply("Java");
		System.out.println(res);
		
		uoString = Principal::hacerRico;
		System.out.println(uoString.apply("Java"));
		
		BinaryOperator<String> boString = Principal::concatenar;
		System.out.println(boString.apply("Hello ", "World Java"));
		
		Supplier<String> s = Principal::getParadigma;
		System.out.println(s.get());
		
	}
	
	static String hacerRico(String string) {
		return string + "$$";
	}
	
	static String concatenar(String s1, String s2) {
		return s1+s2;
	}
	
	static String getParadigma() {
		return "Java Funcional";
	}
	

}
