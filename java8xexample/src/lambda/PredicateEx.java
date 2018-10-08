package lambda;

import java.util.function.Predicate;

public class PredicateEx {
	public static void main(String[] args) {


		Predicate<String> predicateStringTest = s -> {
			return s.equals("dada");
		};

		System.out.println(predicateStringTest.test("test"));
		System.out.println(predicateStringTest.test("test1"));


		Predicate<Integer> predicateIntTest = i -> {
			return i > 20;
		};

		System.out.println(predicateIntTest.test(100));
		System.out.println(predicateIntTest.test(10));
	}
}


// predicate ------ check conditions and returns boolean