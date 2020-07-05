package demo3;

public class Principal {
	
	public static void main(String[] args) {
		
		String cadena1 = "Hola ";
		String cadena2 = "Mundo Java Funcional";
		
		String cadenaFinal = Utils.transforma(cadena1, cadena2, 
				String::concat);
		
		System.out.println(cadenaFinal);
	}

}
