package com.training.cg;

//FunctionalInterfaces
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class JavaFunctions {
	
	public static void main(String args[]) {
	
		Predicate<Integer> p = b ->{
			if(b > 5) {
				return true;
			}
			else {
				return false;
			}
		};
		
		boolean p1 = p.test(67);
		boolean p2 = p.test(2);
		System.out.println(p1);
		System.out.println(p2);
		System.out.println("-------------------------");
		
	Supplier<Integer> s = () ->((int) (Math.random()*10));
	Supplier<Integer> s1 = () ->(10);
	
	System.out.println(s1.get());
	System.out.println(s.get());
	System.out.println("-------------------------");
	
	Consumer<Integer> c1 = (cc) ->{
		System.out.println(cc);
	};
	c1.accept(78);
	System.out.println("-------------------------");
	
	Function<Long, Long> f1 = (val) -> val + 3;
	Long result = f1.apply((long) 8);
	System.out.println("The result is: " + result);
	}
}

