package lambda.runnable;

public class ThreadEx{
public static void main (String arg[]){
	Runnable task = new Runnable(){
		 
	    @Override
	    public void run(){
	        System.out.println("Task #1 is running");
	    }
	};
	 
	 
	Thread thread = new Thread(task);
	thread.start();
}

}
