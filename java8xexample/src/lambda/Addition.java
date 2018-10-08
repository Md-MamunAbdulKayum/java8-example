package lambda;

public class Addition {
public static void main(String arg[]) {
	
	Addable sum = (x,y) -> x+y;	
	
	int summation = sum.add(20, 20);
	System.out.println("Summation is : "+summation );
	
	int complexSumResult = getcomplexSum(sum);
	System.out.println("complexSumResult is : "+complexSumResult );
	
	
	
}

private static int getcomplexSum(Addable addable){
	
	int addition = addable.add(100, 200)+100;
	
	return addition;
}
}
