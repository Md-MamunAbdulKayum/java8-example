package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerEx {
	  public static void main(String[] args) {

	      
	      Consumer<Integer> consumer = (x) -> System.out.println("s = " + x);

	      consumer.accept(90); // s = 90
	      
	      
	        List<Person> person = Arrays.asList(
	                new Person("mamun", 27),
	                new Person("dada", 27),
	                new Person("sarwar", 20)
	        );
	      
	        personOperation(person, p-> System.out.println(p.name + ": " + p.age)); /* mamun: 27
                                                                                     dada: 27
                                                                                     sarwar: 20 */
	        personOperation(person, p-> System.out.println(p.age*2)); /*54
																		54
																		40
																		 */
	    }
	  
	  private static void personOperation(List<Person> person, Consumer <Person> personConsumer){
		  
	      for (Person e : person) {
	    	  personConsumer.accept(e);
	       }

		  
	  }
}


// does not return anything
// 