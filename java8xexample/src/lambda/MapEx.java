package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapEx {

	public static void main(String args[]){
		 List<Integer> num = Arrays.asList(1,2,3,4,5);
	        List<Integer> collection = num.stream().map(n -> n*5).collect(Collectors.toList());
	        System.out.println(collection); 
	        
	        
	        List<Person> person = Arrays.asList(
	                new Person("mamun", 27),
	                new Person("dada", 27),
	                new Person("sarwar", 20)
	        );
	        
	        List<String> collectName = person.stream().map(x -> x.getName()).collect(Collectors.toList());
	        System.out.println(collectName); 

	}
}

// takes a function --- returns accordingly
