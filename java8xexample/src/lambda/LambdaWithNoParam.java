package lambda;

public class LambdaWithNoParam {
	@FunctionalInterface
	interface Printable {
	
	    public String printHello();
	}
	
	   public static void main(String args[]) {
		   Printable printMsg = () ->  "Hello";
	        System.out.println("First message: "+printMsg.printHello());
	        
	        Printable printMsg1 = () -> {
	        	String hello = "Hello world";
	    		return hello;
	    	};
	    	
	    	System.out.println("Second message: "+printMsg1.printHello());
	    }
}
