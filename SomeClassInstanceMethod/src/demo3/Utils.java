package demo3;

import java.util.function.BinaryOperator;

public class Utils {
	
	public static String transforma(String s1, String s2,
			BinaryOperator<String> bo) {
		
		return (bo.apply(s1,s2));
	}

}
