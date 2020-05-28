package funcional.comparator;

import java.util.Comparator;

import funcional.pojo.Empleado;

public class ComparatorSueldo implements Comparator<Empleado> {

	@Override
	public int compare(Empleado o1, Empleado o2) {
		return (int) (o2.getSueldo() - o1.getSueldo());
	}

}
