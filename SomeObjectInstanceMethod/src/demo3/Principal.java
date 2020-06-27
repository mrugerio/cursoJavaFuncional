package demo3;

public class Principal {
	
	public static void main(String[] args) {
		
		String cadena1 = "Hola ";
		String cadena2 = "Mundo Java";
		
		//String cadenaFinal = Utils.transforma(cadena2, 
				//x -> cadena1.concat(x));
		
		String cadenaFinal = Utils.transforma(cadena2, 
				cadena1::concat);
		
		System.out.println(cadenaFinal);
	}

}
