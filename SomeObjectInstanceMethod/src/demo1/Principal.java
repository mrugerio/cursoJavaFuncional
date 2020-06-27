package demo1;

import java.util.function.Consumer;

public class Principal {

	public static void main(String[] args) {
		
		Mecanico instanciaMec = new Mecanico();
		Carro carro5 = new Carro();
		carro5.id = 5;
		//Consumer<Carro> consumer =
		//		c -> instanciaMec.arreglar(c);
		Consumer<Carro> consumer = instanciaMec::arreglar;
		consumer.accept(carro5);
		
	}

}

class Carro{
	int id;
	String color;
}

class Mecanico {
	void arreglar(Carro c) {
		System.out.println("Arreglando carro id: "+c.id);
	}
}


