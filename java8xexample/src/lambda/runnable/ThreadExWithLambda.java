package lambda.runnable;

public class ThreadExWithLambda {
	public static void main (String arg[]){

		Runnable task = () -> { System.out.println("Task #2 is running"); };
		 
		new Thread(task).start();
	}
}
