package demo.lambdas;

import java.util.function.*;

public class Principal {

	public static void main(String[] args) {

		// LongSupplier
		System.out.println("Demo LongSupplier");
		LongSupplier ls = () -> (long) (Math.random() * 1000000000);
		System.out.println(ls.getAsLong());

		
		// DoubleConsumer
		System.out.println("Demo DoubleConsumer");
		DoubleConsumer display = a -> System.out.println((a * 10));
		display.accept(3.0);
		
		// LongPredicate
		System.out.println("Demo LongPredicate");
		LongPredicate longPred = (l) -> (l > 0);
	    System.out.println(longPred.test(50));
	    System.out.println(longPred.test(-10));
	    
	    //IntFunction<R>
		System.out.println("Demo IntFunction<R>");
	    IntFunction<Double> ifd = a -> a / 2.0; 
	    System.out.println(ifd.apply(3)); 
	    
	    //DoubleUnaryOperator
		System.out.println("Demo DoubleUnaryOperator");
	    DoubleUnaryOperator op = a -> 2 * a; 
        System.out.println(op.applyAsDouble(12.0));
        
        //IntBinaryOperator
		System.out.println("Demo IntBinaryOperator");
        IntBinaryOperator io = (x,y)->x*y;
        System.out.println(io.applyAsInt(2,3));
        
        //BooleanSupplier
		System.out.println("Demo BooleanSupplier");
        BooleanSupplier bs = () -> "Java".equals("Java");
		System.out.println(bs.getAsBoolean());
		
		//ToDoubleFunction<T>
		System.out.println("Demo ToDoubleFunction<T>");
		ToDoubleFunction<Integer> ob = a -> a / 2.5; 
		System.out.println(ob.applyAsDouble(3)); 
		
		//ToLongBiFunction<T,U>
		System.out.println("Demo ToLongBiFunction<T,U>");
		ToLongBiFunction<Integer, String> lbf = (a, b) -> a + Integer.parseInt(b) * 1000000; 
	    System.out.println(lbf.applyAsLong(3, "10"));
	    
	    //DoubleToIntFunction
		System.out.println("Demo DoubleToIntFunction");
		DoubleToIntFunction truncate = a -> (int)a; 
		System.out.println(truncate.applyAsInt(10.6)); 
		
		//ObjIntConsumer<T>
		System.out.println("Demo ObjIntConsumer<T>");
		ObjIntConsumer<String> i  = (s,d)->System.out.println(s+d);
	    i.accept("Hello World Java: ",123);
	    
	}
}
