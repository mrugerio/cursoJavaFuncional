package interfaces;

@FunctionalInterface
public interface Predicado <T> {
	
	boolean probar(T t);
	
	default Predicado<T> negate(){
		return x -> !this.probar(x);
	}
	
	default Predicado<T> and(Predicado<T> pre2){
		return x -> (this.probar(x) && pre2.probar(x));
	}
	
	default Predicado<T> or(Predicado<T> pre2){
		return x -> (this.probar(x) || pre2.probar(x));
	}
	
	/*static <T> Predicado<T> negate(Predicado<T> p){
		return x -> !p.probar(x);
	}
	
	static <T> Predicado<T> and(
			Predicado<T> pre1, Predicado<T> pre2){
		return x -> (pre1.probar(x) && pre2.probar(x));
	}
	
	static <T> Predicado<T> or(
			Predicado<T> pre1, Predicado<T> pre2){
		return x -> (pre1.probar(x) || pre2.probar(x));
	}*/
	
	/*static void probarStatic() {
		System.out.println("Probar static");
	}
	
	default void probarDefault() {
		System.out.println("Probar default");
	}
	
	static <T> Predicado<T> returnPredicate() {
		return x -> true;
	}*/

}
