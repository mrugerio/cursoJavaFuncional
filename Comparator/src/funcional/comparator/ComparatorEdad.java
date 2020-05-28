package funcional.comparator;

import java.util.Comparator;

import funcional.pojo.Empleado;

public class ComparatorEdad implements Comparator<Empleado> {

	@Override
	public int compare(Empleado o1, Empleado o2) {
		return o1.getEdad() - o2.getEdad();
	}

}
