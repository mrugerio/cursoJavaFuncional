package demo1;

import java.util.function.BiConsumer;

public class Principal {

	public static void main(String[] args) {
		
		Mecanico instanciaMec = new Mecanico();
		Carro carro5 = new Carro();
		carro5.id = 5;
		//BiConsumer<Mecanico,Carro> biConsumer =
				//(m,c) -> m.arreglar(c);
		BiConsumer<Mecanico,Carro> biConsumer = Mecanico::arreglar;
		biConsumer.accept(instanciaMec,carro5);
		
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


